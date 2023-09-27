import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS;
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        int[] items;
        items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items ( separated ): ");
        int item;
        for (int i = 0; i < NUM_ITEMS; i++) {
            item = sc.nextInt();
            items[i] = item;
        }

        for (int i = 0; i < NUM_ITEMS; i++) {
            if (i == 0) {
                System.out.print("The values are: [" + items[0] + ", ");
            } else if (i == NUM_ITEMS - 1) {
                System.out.print(items[i] + "]");
            } else {
                System.out.print(items[i] + ", ");
            }
        }
    }
}
