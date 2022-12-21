package ny.home.argocd.restclient.lightmodel;

public class RepositoryConnection {
    public static final String ENDPOINT = "/api/v1/repositories";
    public static final String CONTRACT_EXAMPLE = """
    {
      "project": {
        "metadata": {
          "name": "zeebe",
          "namespace": "argocd",
          "generation": 2
        },
        "spec": {
          "sourceRepos": [
            "https://nene:gitlab74!@gitlab.ny.home/nene/argo-applications.git"
          ],
          "description": "zeebe clusters",
          "destinations": [
            {
              "server": "https://kubernetes.default.svc",
              "namespace": "*",
              "name": "*"
            }
          ]
        },
        "status": {}
      }
    }
    """;
}
