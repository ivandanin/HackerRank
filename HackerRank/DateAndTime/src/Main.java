import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] date = scanner.nextLine().split("\\s+");

        int month = Integer.parseInt(date[0]);
        int day = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        LocalDate dayOfWeek = LocalDate.of(year, month, day);
        System.out.println(dayOfWeek.getDayOfWeek());
    }
}
