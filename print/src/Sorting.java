import java.util.Arrays;

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

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int counter = 0;

        for (int i = index; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                counter = i;
            }
        }
        return counter;
    }

    public static void swap(int[] array, int index1, int index2) {
        int number1 = array[index1];
        int number2 = array[index2];

        array[index1] = number2;
        array[index2] = number1;
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array) + " - start");
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
}
