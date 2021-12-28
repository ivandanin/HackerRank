import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }


    }
    private static boolean isAnagram(String a, String b) {

        if (a == null || b == null || a.equals("") || b.equals("")) {
            return false;
        }

        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < b.length(); k++) {
            char letter = b.charAt(k);

            if (!map.containsKey(letter)) {
                map.put(letter, 1);

            } else {
                Integer countOfLetters = map.get(letter);
                map.put(letter, ++countOfLetters);

            }
        }

            for (int k = 0; k < a.length(); k++) {
                char letter = a.charAt(k);

                if (!map.containsKey(letter)) {
                    return false;
                }

                Integer countOfLetters = map.get(letter);

                if (countOfLetters == 0) {
                    return false;

                } else {
                    map.put(letter, --countOfLetters);
                }
            }
        return true;
    }
}
