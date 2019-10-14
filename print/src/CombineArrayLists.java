import java.util.ArrayList;

public class CombineArrayLists {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }
    public static ArrayList smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int s : first) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        for (int s : second) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(4);
        list1.add(3);
        list1.add(3);

        list2.add(5);
        list2.add(4);
        list2.add(10);
        list2.add(7);

        smartCombine(list1, list2);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("Smart list: " + smartCombine(list1, list2));
    }
}
