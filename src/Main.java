import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import com.google.gson.JsonObject;

public class Main {

    public static void main(String[] args) {

        String apiKey = "1ec68c65e048fba40742ddec";

        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

        ExchangeApiClient apiClient = new ExchangeApiClient();
        ExchangeRequestBuilder requestBuilder = new ExchangeRequestBuilder();
        ExchangeResponseHandler responseHandler =
                new ExchangeResponseHandler(apiClient.getHttpClient());

        ExchangeRateParser parser = new ExchangeRateParser();
        CurrencyFilter filter = new CurrencyFilter();
        CurrencyConverter converter = new CurrencyConverter();
        ConsoleMenu menu = new ConsoleMenu();

        try {

            HttpRequest request = requestBuilder.buildRequest(url);
            HttpResponse<String> response = responseHandler.sendRequest(request);

            JsonObject json = parser.parse(response.body());

            Map<String, Double> currencies = filter.filterCurrencies(json);

            menu.start(currencies, converter);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}