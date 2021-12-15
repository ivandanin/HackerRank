import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal money = new BigDecimal(scanner.nextLine());


        NumberFormat usCurrFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + usCurrFormatter.format(money));

        Locale in = new Locale("en", "IN");
        NumberFormat inCurrFormatter = NumberFormat.getCurrencyInstance(in);
        System.out.println("India: " + inCurrFormatter.format(money));


        NumberFormat rocCurrFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + rocCurrFormatter.format(money));

        NumberFormat frCurrFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + frCurrFormatter.format(money));

    }

}
