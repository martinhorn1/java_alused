import java.util.Scanner;
public class Usernames {
    public static void main(String[] args) {
        System.out.print("Type your username: ");
        Scanner reader = new Scanner(System.in);
        String user = reader.nextLine();

        System.out.print("Type your password: ");
        Scanner reader2 = new Scanner(System.in);
        String pass = reader2.nextLine();

        if ((user.equals("alex") && pass.equals("mightyducks")) || (user.equals("emily") && pass.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        }
        else {
            System.out.println("The username or password is invalid!");
        }
    }
}
