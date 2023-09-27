public class Print {
    public static void main(String[] args) {
        int[] intEmp = {};
        float[] floatEmp = {};
        double[] doubleEmp = {};

        int[] intOne = {2};
        float[] floatOne = {0.1F};
        double[] doubleOne = {0.2};


        int[] intTestMul = {1, 2, 3, 4, 5};
        float[] floatMul = {0.1F, 0.2F};
        double[] doubleMul = {1.1, 2.2};

        print(intOne);
//        print(floatOne);
//        print(doubleOne);
        print(intEmp);
//        print(floatEmp);
//        print(doubleEmp);
        print(intTestMul);
//        print(floatTestMul);
//        print(doubleTestMul);
    }

    public static void print(int[] array) {
        int size = array.length;
        if (size == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < size; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.println("]");
        }
    }

    public static void print(double[] array) {
        int size = array.length;
        if (size == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < size; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.println("]");
        }
    }

    public static void print(float[] array) {
        int size = array.length;
        if (size == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < size; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.println("]");
        }
    }
}
