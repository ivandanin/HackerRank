import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        s = s.trim();

        if (s.length() > 0) {
            String[] tokens = s.split("[ !,?._'@]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }
    }
}
