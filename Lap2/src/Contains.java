public class Contains {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int key = 5;
        if (contains(array, key))
            System.out.printf("This array contains element %d", key);
        else
            System.out.printf("This array don't contains element %d", key);
    }

    public static boolean contains(int[] array, int key) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
