import java.util.ArrayList;

public class AverageOfThreeNumbers {
    public static double average(ArrayList<Integer> list) {
        int sum = 0;
        for (int elem : list) {
            sum += elem;
        }
        return ((double)sum/(list.size()));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
