import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<BigDecimal> list = new LinkedList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String s = scanner.nextLine();

            BigDecimal num = new BigDecimal(s);
            list.add(num);
        }
        list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
