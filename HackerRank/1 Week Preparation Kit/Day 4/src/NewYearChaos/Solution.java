package NewYearChaos;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribes = 0;
        int bribe1 = Integer.MAX_VALUE;
        int bribe2 = Integer.MAX_VALUE;

        for (int i = q.size() - 1; i >= 0; i--) {
            int sticker = q.get(i);
            if (sticker - i - 1 > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if(sticker > bribe1) {
                bribes++;

            } if (sticker > bribe2) {
                bribes++;
            }
            if (sticker < bribe1 || sticker < bribe2) {
                if (bribe1 > bribe2) {
                    bribe1 = sticker;
                } else {
                    bribe2 = sticker;
                }
            }
        }
        System.out.println(bribes);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
