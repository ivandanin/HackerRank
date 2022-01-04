import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) {
            BigDecimal max = new BigDecimal(s[i]);
            int index = i;

            for (int j = i + 1; j < n; j++) {
                BigDecimal curr = new BigDecimal(s[j]);

                if (curr.compareTo(max) > 0) {
                    max = curr;
                    index = j;
                }
            }
                    String temp = s[i];
                    s[i] = s[index];
                    s[index] = temp;

        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
