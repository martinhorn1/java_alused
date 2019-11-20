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

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book s : this.Library) {
            if (StringUtils.included(s.title, title)) {
                found.add(s);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book s : this.Library) {
            if (StringUtils.included(s.publisher, publisher)) {
                found.add(s);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book s : this.Library) {
            if (s.year == year) {
                found.add(s);
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: Library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
    }
}
