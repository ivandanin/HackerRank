import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            map.put(name, phone);
        }
        while (scanner.hasNext()) {
            String toFind = scanner.nextLine();
            System.out.println(map.containsKey(toFind)
                    ? (toFind + "=" + map.get(toFind))
                    : "Not found");
            }
    }
}
