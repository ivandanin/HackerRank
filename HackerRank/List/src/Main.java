import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q * 2; i++) {
            String func = scanner.nextLine();
            switch (func) {
                case "Insert":
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    list.add(x, y);
                    break;
                case "Delete":
                    int r = scanner.nextInt();
                    list.remove(r);
                    break;
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}