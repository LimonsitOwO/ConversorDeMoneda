import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExchangeRate exchange = new ExchangeRate();
        int menu = 0;
        String menuConsole = """
                **********************************************
                1 - ARS - Peso argentino
                2 - BOB - Boliviano boliviano
                3 - BRL - Real brasileño
                4 - CLP - Peso chileno
                5 - COP - Peso colombiano
                6 - USD - Dólar estadounidense
                9 - Salir
                """;
        while (menu != 9) {
            System.out.println(menuConsole);
            System.out.print("Seleccione la moneda base: ");
            menu = scan.nextInt();
            if (menu == 9) {
                System.out.println("Saliendo...");
                break;
            }
            String baseCurrency = getCurrencyCode(menu);
            if (baseCurrency == null) {
                System.out.println("El número no está dentro de la selección.");
                continue;
            }
            ExchangeRateRecord data = exchange.searchExchange(baseCurrency);
            System.out.print("Seleccione la moneda de destino: ");
            menu = scan.nextInt();
            if (menu == 9) {
                System.out.println("Saliendo...");
                break;
            }
            String targetCurrency = getCurrencyCode(menu);
            if (targetCurrency == null) {
                System.out.println("El número no está dentro de la selección.");
                continue;
            }
            System.out.print("Escriba la cantidad de la moneda base que desea transformar: ");
            double quantity = scan.nextInt();
            if (data.conversion_rates().containsKey(targetCurrency.toUpperCase())) {
                double rate = data.conversion_rates().get(targetCurrency.toUpperCase());
                System.out.printf("1 %s = %.4f %s%n", baseCurrency, rate, targetCurrency);
                double total = rate * quantity;
                System.out.printf("%.2f * %.4f = %.4f%n", quantity, rate, total);
            } else {
                System.out.println("No se encontró una tasa de conversión para la moneda seleccionada.");
            }
            System.out.print("Escriba 1 para seguir, 0 para salir ");
            menu = scan.nextInt();
            if (menu == 0) {
                System.out.println("Saliendo...");
                break;
            }
        }
        scan.close();
    }

    private static String getCurrencyCode(int menu) {
        return switch (menu) {
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> null;
        };
    }
}
