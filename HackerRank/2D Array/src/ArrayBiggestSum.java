import java.util.Scanner;

public class ArrayBiggestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] lines = new int[6][6];
        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 6; c++) {
                lines[r][c] = scanner.nextInt();
                if (r > 1 && c > 1) {
                    int sum = lines[r][c]
                                    + lines[r][c-1]
                                    + lines[r][c-2]
                                    + lines[r-1][c-1]
                                    + lines[r-2][c]
                                    + lines[r-2][c-1]
                                    + lines[r-2][c-2];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
