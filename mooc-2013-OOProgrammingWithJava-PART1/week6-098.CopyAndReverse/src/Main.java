import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }

    public static int[] copy(int[] array) {
        int[] newCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newCopy[i] = array[i];
        }
        return newCopy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] newCopy = new int[array.length];
        int j = 0;
        for (int i = array.length; i > 0; i--) {
            newCopy[j] = array[i-1];
            j++;
        }
        return newCopy;
    }
}
