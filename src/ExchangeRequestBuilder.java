import java.net.URI;
import java.net.http.HttpRequest;

public class ExchangeRequestBuilder {

    public HttpRequest buildRequest(String url) {
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
    }
}