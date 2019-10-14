import java.util.ArrayList;

public class Variance {
    public static double variance(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer s : list) {
            sum += s;
        }
        double average = (double)sum/list.size();

        double varianceSum = 0;

        for (Integer s : list) {
            varianceSum += (Math.pow((average - s),2));
        }

        double varianceResult = varianceSum/(list.size()-1);

        return varianceResult;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
