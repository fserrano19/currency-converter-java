import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public class CurrencyFilter {

    public Map<String, Double> filterCurrencies(JsonObject jsonObject) {

        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

        if (rates == null) {
            throw new RuntimeException("conversion_rates not found in API response");
        }

        Map<String, Double> currencies = new HashMap<>();

        currencies.put("ARS", rates.get("ARS").getAsDouble());
        currencies.put("BOB", rates.get("BOB").getAsDouble());
        currencies.put("BRL", rates.get("BRL").getAsDouble());
        currencies.put("CLP", rates.get("CLP").getAsDouble());
        currencies.put("COP", rates.get("COP").getAsDouble());

        return currencies;
    }
}