import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Type the password: ");
            String pass = reader.nextLine();

            if (pass.equals("carrot")) {
                System.out.println("Correct");
                System.out.println("SECRET MESSAGE");
                break;
            }
            else {
                System.out.println("Wrong");
            }
        }
    }
}
