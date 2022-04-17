package CaesarCipher;

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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        char[] charArr = s.toCharArray();

        k = k % 26;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] >= 65 && charArr[i] <= 90) {
                if (charArr[i] + k > 90) {
                    charArr[i] -= 26;
                }
                charArr[i] += k;
            } else if (charArr[i] >= 97 && charArr[i] <= 122) {
                if (charArr[i] + k > 122) {
                    charArr[i] -= 26;
                }
                charArr[i] += k;
            }
        }
        s = String.valueOf(charArr);
        return s;
    }

}

public class CaesarCipher { // Solution
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
