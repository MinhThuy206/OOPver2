public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{5, 3, 1}, {3, 4, 6}, {3, 3, 2}};

        int[][] matrix2 = {{5, 1, 1}, {2, 8, 6}, {7, 4, 2}};

        double[][] matrix3 = {{5, 3, 1}, {3, 4, 6}, {3, 3, 2}};

        double[][] matrix4 = {{5, 1, 1}, {2, 8, 6}, {7, 4, 2}};

        print(matrix1);
        System.out.println(haveSameDimension(matrix1, matrix2));
        System.out.println(haveSameDimension(matrix3, matrix4));
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;

    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] matrixadd = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    matrixadd[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return matrixadd;
        }
        return null;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] matrixadd = new double[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    matrixadd[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return matrixadd;
        }
        return null;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return matrix3;
        }
        return null;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return matrix3;
        }
        return null;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        sum = sum + matrix1[i][k] * matrix2[k][i];
                    }
                    matrix3[i][j] = sum;
                }
            }
            return matrix3;
        }
        return null;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    double sum = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        sum = sum + matrix1[i][k] * matrix2[k][i];
                    }
                    matrix3[i][j] = sum;
                }
            }
            return matrix3;
        }
        return null;
    }
}