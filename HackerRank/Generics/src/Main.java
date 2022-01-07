public class Main {
    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3};
        String[] stringArr = {"Hello", "World"};

        printArray(intArr);
        printArray(stringArr);

    }
    public static <E> void printArray(E[] arr) {
        for (E e : arr) {
            System.out.println(e);
        }
    }
}
