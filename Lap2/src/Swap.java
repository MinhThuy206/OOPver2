import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {6, 7, 8, 9};
        if (swap(array1, array2)) {
            System.out.println("Contents are successfully swapped.");
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
        } else
            System.out.print("Can't swap");
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            int temp;
            for (int i = 0; i < array1.length; i++) {
                temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }
    }
}
