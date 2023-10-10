import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static int[] grades;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        grades = new int[n];
        readGrades(n);
        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is: %.2f %n", average(grades));
        System.out.printf("The median is: %.2f %n", median(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.printf("The standard deviation is: %.2f %n", stdDev(grades));

    }

    public static void readGrades(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static double median(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        if (size % 2 == 1) {
            return arr[size / 2];
        } else {
            return (double) (arr[size / 2 - 1] + arr[size / 2]) / 2;
        }
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i :
                arr) {
            if (min > i)
                min = i;
        }
        return min;
    }

    public static double stdDev(int[] arr) {
        double sum = 0;
        int size = arr.length;
        for (int j : arr) {
            sum += j * j;
        }
        return Math.sqrt((double) 1 / size * sum - average(arr) * average(arr));
    }
}
