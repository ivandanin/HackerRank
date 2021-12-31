import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            PatternSyntaxException exception = null;
            String toCheck = scanner.nextLine();

            try {
            Pattern.compile(toCheck);
            } catch (PatternSyntaxException e) {
                exception = e;
            }
            if (exception != null) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
        }
    }
}
