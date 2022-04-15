import java.util.ArrayList;
import java.util.Scanner;

class Student {}
class Rockstar {}
class Hacker {}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> arrayList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String person = scanner.nextLine();
            switch (person) {
                case "Student" -> arrayList.add(new Student());
                case "Rockstar" -> arrayList.add(new Rockstar());
                case "Hacker" -> arrayList.add(new Hacker());
            }
        }
            count(arrayList);
    }
    static void count(ArrayList<Object> arrayList) {
        int stud = 0;
        int rock = 0;
        int hacker = 0;

        for (Object o : arrayList) {
            if (o instanceof Student) {
                stud++;
            } else if (o instanceof Rockstar) {
                rock++;
            } else if (o instanceof Hacker) {
                hacker++;
            }
        }
        System.out.println(stud + " " + rock + " " + hacker);
    }
}
