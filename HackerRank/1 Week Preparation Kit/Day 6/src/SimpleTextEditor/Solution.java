package SimpleTextEditor;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int q = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();
        Stack<String> stack = new Stack<>();

        while (q-- > 0) {
            int i = scanner.nextInt();
            if (i == 1) {
                String w = scanner.nextLine();

                String top = stack.isEmpty()
                        ? ""
                        : stack.peek();
                stack.push(top + w);
                output.append(w);
            } else if (i == 2) {
                int k = scanner.nextInt();
                String top = stack.isEmpty() ? "" : stack.peek();
                top = top.substring(0, top.length() - k);
                stack.push(top);

                output.delete(output.length() - k, output.length() - 1);
            } else if (i == 3) {
                int k = scanner.nextInt();
                System.out.println(output.charAt(k));
            }  else if (i == 4) {
                stack.pop();
            }
        }
    }
}
