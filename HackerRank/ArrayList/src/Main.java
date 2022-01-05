import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                arr.add(scanner.nextInt());
            }
            arrayLists.add(arr);
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                System.out.println(arrayLists.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}