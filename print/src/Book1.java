public class Book1 implements ToBeStored {
    public String writer;
    public String name;
    public double weight;

    public Book1(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name;
    }

    @Override
    public double weight() {
        return this.weight;
    }


    public static void main(String[] args) {
        Book1 book1 = new Book1("Fedor Dostojevski", "Crime and Punishment", 2);
        Book1 book2 = new Book1("Robert Martin", "Clean Code", 1);
        Book1 book3 = new Book1("Kent Beck", "Test Driven Development", 0.5);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
