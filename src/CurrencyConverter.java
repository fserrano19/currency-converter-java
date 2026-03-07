import java.text.DecimalFormat;

public class CurrencyConverter {

    private final DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

    public String convert(double amount, double rate, String currency) {

        double result = amount * rate;

        return decimalFormat.format(result) + " " + currency;
    }
}