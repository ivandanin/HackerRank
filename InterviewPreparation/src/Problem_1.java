import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Please, insert the count of numbers to input.");
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            System.out.println("Please, insert a number.");
            int number = Integer.parseInt(scanner.nextLine());
            numbers.add(number);
        }

        System.out.println("Please, insert desired sum.");
        int desiredSum = Integer.parseInt(scanner.nextLine());

        Collections.sort(numbers);
        int start = 0;
        int end = numbers.size() - 1;

        while (start != end) {

            int sum = numbers.get(start) + numbers.get(end);
            if (sum == desiredSum) {
                System.out.println(numbers.get(start) + " + " + numbers.get(end) + " = " + desiredSum);
                break;
            } else if (sum > desiredSum) {
                end--;
            } else {
                start++;
            }
        }
    }
}
