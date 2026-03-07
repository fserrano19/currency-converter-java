import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeResponseHandler {

    private final HttpClient httpClient;

    public ExchangeResponseHandler(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public HttpResponse<String> sendRequest(HttpRequest request) {
        try {
            return httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("Error sending HTTP request", e);
        }
    }
}