import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());
        System.out.println(dayOfProgrammer(year));


    }
    public static String dayOfProgrammer(int year) {
        int dayOfPrgrammer = 256;
        int sum = 0;
        for (int i = 1; i <= 9; i+=2) { //1, 3, 5, 7, 8
            sum += 31;
        }
        for (int i = 4; i < 8; i+=2) { //4, 6
            sum += 30;
        }

        if (year < 1918 && year % 4 == 0) {
            sum += 1;
        } else if (year < 1918){
            sum -= 1;
        }
        if (year % 4 == 0) {
            sum += 28; //2
        } else {
            sum += 29;
        }
        return (dayOfPrgrammer - sum) + ".09." + year;
    }
}
