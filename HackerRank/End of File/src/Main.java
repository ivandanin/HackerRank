import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //with for-cycle
        for (int i = 1; scanner.hasNext(); i++) {
            System.out.println(i + " " + scanner.nextLine());
        }


        //with while statement
        int i = 0;
        while (scanner.hasNext()) {
            i++;
            System.out.println(i + " " + scanner.nextLine());
        }
        
    }
}
