import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int breadth = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int area = 0;

            if (breadth > 0 && height > 0) {
                area = breadth * height;
                System.out.println(area);

            } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
    }
}
