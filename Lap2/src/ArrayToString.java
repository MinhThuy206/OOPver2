import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int[] intTestOne = {1};
        int[] intTestEmp = {};
        int[] intTestMul = {1, 2};

        System.out.println(arrayToString(intTestOne));
    }

    public static String arrayToString(int[] array) {
        String arrayString = "";
        if (array.length == 0) {
            System.out.println("[]");
        } else {
            arrayString = "[" + array[0];
            for (int i = 1; i < array.length; i++) {
                arrayString += ", " + array[i];
            }

            arrayString += "]";
        }
        return arrayString;
    }
}
