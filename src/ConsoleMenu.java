import java.util.Map;
import java.util.Scanner;

public class ConsoleMenu {

    private final Scanner scanner = new Scanner(System.in);

    public void start(Map<String, Double> currencies, CurrencyConverter converter) {

        int option = 0;

        while (option != 7) {

            System.out.println("\n=== Currency Converter ===");
            System.out.println("1) Dollar => Argentine Peso");
            System.out.println("2) Argentine Peso => Dollar");
            System.out.println("3) Dollar => Brazilian Real");
            System.out.println("4) Brazilian Real => Dollar");
            System.out.println("5) Dollar => Colombian Peso");
            System.out.println("6) Colombian Peso => Dollar");
            System.out.println("7) Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            if (option == 7) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            switch (option) {

                case 1 -> convertUSDToCurrency("ARS", amount, currencies, converter);
                case 2 -> convertCurrencyToUSD("ARS", amount, currencies);
                case 3 -> convertUSDToCurrency("BRL", amount, currencies, converter);
                case 4 -> convertCurrencyToUSD("BRL", amount, currencies);
                case 5 -> convertUSDToCurrency("COP", amount, currencies, converter);
                case 6 -> convertCurrencyToUSD("COP", amount, currencies);

                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void convertUSDToCurrency(String currency, double amount,
                                      Map<String, Double> currencies,
                                      CurrencyConverter converter) {

        double rate = currencies.get(currency);
        String result = converter.convert(amount, rate, currency);

        System.out.println(amount + " USD = " + result);
    }

    private void convertCurrencyToUSD(String currency, double amount,
                                      Map<String, Double> currencies) {

        double rate = currencies.get(currency);
        double result = amount / rate;

        System.out.println(amount + " " + currency + " = " + result + " USD");
    }
}