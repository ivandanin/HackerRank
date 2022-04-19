package QueueUsingStacks;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int q = Integer.parseInt(scanner.nextLine());

        while (q-- > 0) {

            int i = scanner.nextInt();
            if (i == 3) {
                System.out.println(queue.peekFirst());
            } else if (i == 2) {
                queue.remove();
            } else if (i == 1) {
                queue.add(scanner.nextInt());
            }
        }
    }
}

