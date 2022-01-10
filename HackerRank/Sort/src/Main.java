import java.util.*;

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            int id = Integer.parseInt(input[0]);
            String name = input[1];
            double cgpa = Double.parseDouble(input[2]);

            Student student = new Student(id, name, cgpa);
            students.add(student);

        }
        students.sort(Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName).thenComparing(Student::getId));

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
