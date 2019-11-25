public class Sorting {
    public static int smallest(int[] array) {
        int result = array[0];
        for (int s : array) {
            if (s < result) {
                result = s;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Smallest number: " + smallest(values));
    }
}
