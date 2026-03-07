import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateParser {

    public JsonObject parse(String jsonResponse) {

        return JsonParser
                .parseString(jsonResponse)
                .getAsJsonObject();

    }
}