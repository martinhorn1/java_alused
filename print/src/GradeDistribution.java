import java.util.ArrayList;
import java.util.Scanner;

public class GradeDistribution {
    public static int getGrade(Scanner scanner) {
        int grade = Integer.parseInt(scanner.nextLine());
        return grade;
    }

    public static void gradeDistributor(ArrayList<Integer> grades) {
        String grade5 = "";
        String grade4 = "";
        String grade3 = "";
        String grade2 = "";
        String grade1 = "";
        String grade0 = "";
        for (Integer grade : grades) {
            if (grade <=60 && grade >= 0) {
                if (grade >= 54) {
                    grade5 += "*";
                }
                else if (grade >= 48) {
                    grade4 += "*";
                }
                else if (grade >= 42) {
                    grade3 += "*";
                }
                else if (grade >= 36) {
                    grade2 += "*";
                }
                else if (grade >= 30) {
                    grade1 += "*";
                }
                else {
                    grade0 += "*";
                }
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + grade5);
        System.out.println("4: " + grade4);
        System.out.println("3: " + grade3);
        System.out.println("2: " + grade2);
        System.out.println("1: " + grade1);
        System.out.println("0: " + grade0);
    }

    public static double acceptance(ArrayList<Integer> grades) {
        int accepted = 0;
        for (Integer grade : grades) {
            if (grade >= 30) {
                accepted ++;
            }
        }
        return (100*accepted/grades.size());
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Type exam scores, highest grade is 60, -1 completes:");
        while (true) {
            int grade = getGrade(reader);
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }
        gradeDistributor(grades);
        System.out.print("Acceptance percentage: " + acceptance(grades));
    }
}
