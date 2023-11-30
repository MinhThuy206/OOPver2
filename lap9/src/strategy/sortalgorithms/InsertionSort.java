package strategy.sortalgorithms;

public class InsertionSort implements Sort{
    @Override
    public double[] sort(double[] data) {
        int len = data.length;
        for (int i = 1; i < len - 1; i++) {
            int j = i;
            while (j > 0 && data[j - 1] > data[j]) {
                double temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
                j = j -1;
            }
        }
        return data;
    }
}
