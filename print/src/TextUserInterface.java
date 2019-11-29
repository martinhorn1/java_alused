import java.util.Scanner;

public class TextUserInterface {
    public Scanner reader;
    public Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void add(String word, String translation) {
        dictionary.add(word, translation);
    }

    public String translate(String word) {
        return dictionary.translate(word);
    }

    public void start() {
        System.out.println("Statements: ");
        System.out.println("\tadd - adds a word pair to the dictionary");
        System.out.println("\ttranslate - asks a word and prints its translation");
        System.out.println("\tquit - quit the text user interface");

        while (true) {
            System.out.print("\nStatement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if (input.equals("add")) {
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();

                add(word, translation);
            }
            else if (input.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + translate(word));
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
