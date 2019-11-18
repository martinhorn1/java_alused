import java.util.ArrayList;

public class Phonebook {
    public ArrayList<Person> personList = new ArrayList<>();

    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        personList.add(newPerson);
    }

    public void printAll() {
        for (Person s : personList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        phonebook.printAll();
    }
}
