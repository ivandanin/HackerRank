import java.util.Scanner;

public class II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        double num = Double.parseDouble(scanner.nextLine());
        String string = scanner.nextLine();

        System.out.println("String: " + string);
        System.out.println("Double: " + num);
        System.out.println("Int: " + integer);
    }
}
