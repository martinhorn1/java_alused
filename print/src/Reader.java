import java.util.Scanner;

public class Reader {
    public Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);
    }

    public String readString() {
        String read = reader.nextLine();
        return read;
    }

    public int readInteger() {
        int read = Integer.parseInt(reader.nextLine());
        return read;
    }
}
