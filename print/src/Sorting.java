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
    }

    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println(Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println(Arrays.toString(values) );
    }
}
