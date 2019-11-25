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

    public static void main(String[] args) {
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }
}
