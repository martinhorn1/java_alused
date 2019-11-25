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

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int min = array[index];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + indexOfTheSmallest(values));
    }
}
