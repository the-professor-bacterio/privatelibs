package ny.home.zeebe.util;

import ny.home.argocd.restclient.ArgoRestClient;

public class ArgoRestClientFactory {
    private ArgoRestClient client;

    private ArgoRestClient getClient() {
        if (client == null) {
            this.client =  new ArgoRestClient(
                    "https://192.168.1.210:32443",
                    "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJhcmdvY2QiLCJzdWIiOiJuZW5lOmFwaUtleSIsIm5iZiI6MTY3MDUwNDI4MiwiaWF0IjoxNjcwNTA0MjgyLCJqdGkiOiI2MDZjYmFhNy0zZmIxLTQ1MjktYmVmZS1iZTU0MzUyM2Y2ZTkifQ.RJLRgJCfQ7gY1cV6AUWUB-ck_Ju17BXuwcsmBVxb0u8"
            );
        }
        return client;
    }

    private static final ArgoRestClientFactory instance = new ArgoRestClientFactory();

    private ArgoRestClientFactory() {
    }

    public static ArgoRestClient client() {
        return instance.getClient();
    }
}
