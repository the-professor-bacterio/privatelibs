package ny.home.argocd.restclient;

import com.argocd.model.AccountAccountsList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.ApiResponse;
import io.argoproj.workflow.Configuration;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import ny.home.argocd.restclient.lightmodel.*;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

@Data
@NoArgsConstructor
public class ArgoRestClient {
    String baseUrl = "https://192.168.1.210:32443";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJhcmdvY2QiLCJzdWIiOiJuZW5lOmFwaUtleSIsIm5iZiI6MTY3MDUwNDI4MiwiaWF0IjoxNjcwNTA0MjgyLCJqdGkiOiI2MDZjYmFhNy0zZmIxLTQ1MjktYmVmZS1iZTU0MzUyM2Y2ZTkifQ.RJLRgJCfQ7gY1cV6AUWUB-ck_Ju17BXuwcsmBVxb0u8";

    private final ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    private ApiClient argoClient;

    public ArgoRestClient(String argoBaseUrl, String token) {
        this.baseUrl = argoBaseUrl;
        this.token = token;
    }

    private ApiClient client() {
        if (argoClient == null) {
            argoClient = Configuration.getDefaultApiClient();
            argoClient.setBasePath(baseUrl);
            argoClient.setVerifyingSsl(false);
        }

        return argoClient;
    }

    @SneakyThrows({JsonProcessingException.class})
    private String prettyfy(String text) {
        JsonNode pretty = null;
        try {
            pretty = om.readTree(text);
        } catch (Exception ex) {
            return text;
        }
        return om.writeValueAsString(pretty);
    }

    @SuppressWarnings("unchecked")
    private <T> T execute(Request r) {
        try {
            ApiResponse<Object> response = client().execute(toCall(r), AccountAccountsList.class);
            return (T) response.getData();
        } catch (ApiException ex) {
            System.err.println("Error Resonse from API call with code " + ex.getCode());
            String body = ex.getResponseBody();
            System.err.println(prettyfy(ex.getResponseBody()));
            throw new RuntimeException(ex);
        }
    }

    private Call toCall(Request request) {
        return client().getHttpClient().newCall(request);
    }

    private String o2s(Object o) {
        try {
            return om.writeValueAsString(o);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private RequestBody body(Object payload) {
        trace("Request Body",payload);
        return okhttp3.RequestBody.Companion.create(o2s(payload), MediaType.parse("application/json"));
    }

    private Request buildPostRequest(Operation<?> operation) {
        String url = baseUrl + operation.endpoint();
        System.out.println("URL = " + url);
        return new Request.Builder()
                .url(url)
                .header("Cookie", "argocd.token=" + token )
                .post(body(operation.body()))
                .build();
    }

    private <T> T post(Operation<?> operation) {
        return execute(buildPostRequest(operation));
    }

    private Request get(String endpoint) {
        String url = baseUrl + endpoint;
        System.out.println("URL = " + url);
        return new Request.Builder()
                .url(url)
                .header("Cookie", "argocd.token=" + token )
                .get()
                .build();
    }

    public <T> T trace(String message, T o) {
        try {
            System.out.println(message);
            System.out.println(om.writeValueAsString(o));
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }

        return o;
    }

    // CLIENT OPERATIONS
    public AccountAccountsList getAccounts() {
        return execute(get("/api/v1/account"));
    }

    public Object createProject(Project request) {
        return post(request);
    }

    public Object createApplication(Application request) {
        return post(request);
    }

    public Object createRepository(Repository request) {
        return post(request);
    }

    public void connectRepository(RepositoryConnection request) {

    }





}
