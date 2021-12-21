import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String string = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d%n", string, num);
        }

        System.out.println("================================");



    }
}
