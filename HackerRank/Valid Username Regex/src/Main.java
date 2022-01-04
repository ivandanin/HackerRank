import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^([A-Za-z])[_|[A-Za-z0-9]]{7,29}$"; //or ^[A-Za-z]\w{7,29}$
        Pattern p = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String input = scanner.nextLine();

            Matcher m = p.matcher(input);
            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
