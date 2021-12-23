import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        try {
            String string = Integer.toString(n);
            System.out.println("Good job");
        } catch (Exception e) {
            throw new Exception("Wrong answer");
        }

    }
}
