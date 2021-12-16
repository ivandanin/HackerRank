import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char c = '*';

        //one side
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        //separator
        System.out.println();

        //REVERSED
        for (int i = n; i >= 1 ; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        //separator
        System.out.println();

        int spaces = n;

        System.out.println();
        //equals
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.print(c + " ");
                }
                System.out.println();
                spaces--;
        }
    }
}
