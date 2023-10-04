import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 9, 5, 7, 8};
        int[] arrSort = insertionSort(arr);
        System.out.println(Arrays.toString(arrSort));
    }

    public static int[] insertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        return arr;
    }
}
