import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(s.substring(begin, end));
    }
}
