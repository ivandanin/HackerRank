import java.util.Scanner;

public class ChangeArray {
    public static void main(String[] args) {

        int[][] array = {
                {100, 200, 300},
                {400, 500, 600}};

        System.out.println("Original array:");
        printArray(array);
        System.out.println(System.lineSeparator() + "180 degrees array:");
        rotatedArray(array);


    }

    private static void rotatedArray(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                newArray[c][r] = array[r][c];
            }
        }
        printArray(newArray);
    }

    private static void printArray(int[][] array) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
    }
}
