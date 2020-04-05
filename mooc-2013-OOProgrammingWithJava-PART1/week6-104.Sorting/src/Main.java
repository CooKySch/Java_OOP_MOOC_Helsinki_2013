import sun.security.util.ArrayUtil;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        // indexes:    0  1  2  3   4
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }

    public static int smallest(int[] array, int index) {
        //returns smallest number in array, by checking if the number is smaller than current smallest.
        int smallest = array[index];
        while (index < array.length) {
            if (array[index] < smallest) {
                smallest = array[index];
            }
            index++;
        }
        return smallest;
    }

    public static int smallest(int[] array) {
        return smallest(array, 0);
    }

    public static int indexOfTheSmallest(int[] array) {
        return indexOfTheSmallestStartingFrom(array, 0);
    }


    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
            int smallest = smallest(array, index);
            while (index < array.length) {
                if (smallest == array[index])
                    return index;
                index++;
            }
            return -1;
        }

    public static void swap(int[] array, int index1, int index2) {
        int swapNumber = array[index1];
        array[index1] = array[index2];
        array[index2] = swapNumber;
    }

    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length) {
            int swapValue = array[indexOfTheSmallestStartingFrom(array, index)];
            int swapIndex = indexOfTheSmallestStartingFrom(array, index);
            array[swapIndex] = array[index];
            array[index] = swapValue;
            index++;
            }
        }

}
