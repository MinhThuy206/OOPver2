import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array1 = copyOf(array);
        int[] array2 = copyOf(array, 10);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    public static int[] copyOf(int[] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        return array1;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] array2 = new int[newLength];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int i = array.length; i < newLength; i++) {
            array2[i] = 0;
        }
        return array2;
    }
}
