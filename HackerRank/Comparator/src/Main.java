import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> hashSet = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            hashSet.put(line[0],Integer.parseInt(line[1]));
        }

        hashSet.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);


    }
}
