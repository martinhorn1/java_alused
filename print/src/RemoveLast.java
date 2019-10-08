import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    public static void removeLast(ArrayList<String> printed) {
        printed.remove(printed.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("Brothers:");
        System.out.println(brothers);

        removeLast(brothers);
        System.out.println(brothers);
    }
}
