package strategy.sortalgorithms;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        double[] data = {2.0, 4.7, 3.2, 4.9, 7.9};

        SortStrategy sortStrategy = new SortStrategy();
        sortStrategy.setSort(new BubbleSort());
        double[] arr = sortStrategy.sortStrategy(data);
        System.out.println(Arrays.toString(arr));

        // insertionSort
        // selectionSort
    }

}
