import java.net.http.HttpClient;

public class ExchangeApiClient {

    private final HttpClient httpClient;

    public ExchangeApiClient() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }
}