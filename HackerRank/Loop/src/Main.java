import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a;

            for (int j = 0; j <= n - 1; j++) {
                sum += Math.pow(2, j) * b;
                System.out.printf("%s ", sum);
            }
            System.out.println();
        }

    }
}
