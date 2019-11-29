import java.util.Scanner;

public class TextUserInterface {
    public Scanner reader;
    public Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("\tquit - quit the text user interface");

        while (true) {
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else {
                System.out.println("Unknown statement");
            }
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}
