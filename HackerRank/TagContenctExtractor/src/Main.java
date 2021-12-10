import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String str = scanner.nextLine();

            boolean matches = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matches = true;
            } if (!matches) {
                System.out.println("None");
            }
        }
    }
}
