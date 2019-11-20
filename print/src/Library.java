import java.util.ArrayList;

public class Library {
    public ArrayList<Book> Library;

    public Library() {
        this.Library = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        this.Library.add(newBook);
    }

    public void printBooks() {
        for (Book s : this.Library) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Library Library = new Library();

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);

        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        Library.printBooks();
    }
}
