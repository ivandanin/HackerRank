package PlusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double negative = 0;
        double zero = 0;
        double positive = 0;

        for (Integer integer : arr) {
            if (integer < 0) {
                negative++;
            } else if (integer == 0) {
                zero++;
            } else {
                positive++;
            }
        }
        System.out.printf("%.6f\n", positive / arr.size());
        System.out.printf("%.6f\n", negative / arr.size());
        System.out.printf("%.6f\n", zero / arr.size());
    }

}

public class PlusMinus { //Solution
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}