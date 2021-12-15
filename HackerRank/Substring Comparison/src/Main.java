import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine());

        SortedSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i <= string.length() - k; i++) {
            treeSet.add(string.substring(i, i + k));
        }
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
