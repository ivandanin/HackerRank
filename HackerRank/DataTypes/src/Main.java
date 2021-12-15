import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            try {
                long number = scanner.nextLong();
                System.out.printf("%s can be fitted in:%n", number);
                if (number >= -128 && number <= 127) {
                    System.out.println("* byte");
                }
                if (number >= -32768 && number <= 32767) {
                    System.out.println("* short");
                }
                if (number >= -2147483648 && number <= 2147483647) {
                    System.out.println("* int");
                }
                if (number >= -9223372036854775808l) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.printf(scanner.next() + " can't be fitted anywhere.%n");
            }
        }
    }
}
