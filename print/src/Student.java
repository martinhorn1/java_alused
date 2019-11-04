import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public String toString() {
        return this.name + " (" + studentNumber + ")";
    }

    public static void main(String[] args) {
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        System.out.println("-------------");

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.print("name: ");
            String readName = reader.nextLine();
            if (readName.equals("")) {
                break;
            }
            System.out.print("student number: ");
            String readNumber = reader.nextLine();
            list.add(new Student(readName, readNumber));
        }
        System.out.println("-----------");
        for (Student s : list) {
            System.out.println(s.toString());
        }

        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student s : list) {
            if (s.name.contains(search)) {
                System.out.println(s.toString());
            }
        }
    }
}
