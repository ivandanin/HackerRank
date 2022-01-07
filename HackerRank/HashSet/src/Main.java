import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            hashSet.add(input);
            System.out.println(hashSet.size());
        }
    }
}
