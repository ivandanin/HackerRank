import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            array[i] = num;
        }

        for (int arr : array) {
            System.out.println(arr);
        }
    }
}
