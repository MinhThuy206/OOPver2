public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        if (linearSearch(array, 5)) {
            System.out.println("Exists element in the array");
        } else {
            System.out.println("Not exists");
        }

    }

    public static boolean linearSearch(int[] array, int key) {
        for (int item : array) {
            if (item == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
