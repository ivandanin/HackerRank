import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int length;
        length = a.length() + b.length();
        System.out.println(length);

        if (a.compareTo(b) > b.compareTo(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        System.out.println(a.replace(a.substring(0,1), a.substring(0, 1).toUpperCase()) + " "  +
                b.replace(b.substring(0, 1), b.substring(0, 1).toUpperCase()));
    }
}
