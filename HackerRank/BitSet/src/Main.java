import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int num = scanner.nextInt();

        BitSet[] bitSets = new BitSet[]{new BitSet(size), new BitSet(size)};

        Map<String, BiConsumer<Integer, Integer>> map = new HashMap<>();

        map.put("AND", (index1, index2) -> bitSets[index1-1].and(bitSets[index2-1]));
        map.put("OR", (index1, index2) -> bitSets[index1-1].or(bitSets[index2-1]));
        map.put("XOR", (index1, index2) -> bitSets[index1-1].xor(bitSets[index2-1]));
        map.put("FLIP", (index1, index2) -> bitSets[index1-1].flip(index2));
        map.put("SET", (index1, index2) -> bitSets[index1-1].set(index2));

        for (int i = 0; i < num; i++) {
            map.get(scanner.next())
                    .accept(scanner.nextInt(), scanner.nextInt());
            System.out.println(bitSets[0].cardinality() + " " +
                    bitSets[1].cardinality());
        }
    }
}
