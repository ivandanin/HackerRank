import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) == str.charAt(str.length()-i-1))
                count ++;
        }
            System.out.println((count == str.length()/2) ? "Yes" : "No");
    }
}
