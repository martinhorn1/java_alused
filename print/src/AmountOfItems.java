import java.util.ArrayList;

public class AmountOfItems {
    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println(word);
        }
    }

    public static void  removeFirst(ArrayList<String> list) {
        list.remove(0);
    }

    public static int countItems(ArrayList<String> items) {
        return items.size();
    }

    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("Pascal");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");

        System.out.print("There are this many items in the list: ");
        System.out.println(countItems(programmingLanguages));

        print(programmingLanguages);

        removeFirst(programmingLanguages);

        System.out.println();

        System.out.print("There are this many items in the list: ");
        System.out.println(countItems(programmingLanguages));
        print(programmingLanguages);
    }
}
