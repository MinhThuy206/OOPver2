public class Search {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int test = 4;
        System.out.printf("Index of element %d in this array is: %d", test, search(array, test));

    }

    public static int search(int[] array, int key) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }
}