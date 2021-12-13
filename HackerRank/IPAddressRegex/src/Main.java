import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String lines = scanner.nextLine();

            Pattern pattern = Pattern.compile("(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.\1\\.\1\\.\1");
            Matcher matcher = pattern.matcher(lines);
            boolean matches = false;

            if (matcher.find()) {
                matches = true;
                System.out.println(matches);
            } else {
                matches = false;
                System.out.println(matches);
            }
        }
    }
}
