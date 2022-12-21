package ny.home.argocd.restclient.lightmodel;

public interface Operation<T> {
    String endpoint();
    T body();

}
