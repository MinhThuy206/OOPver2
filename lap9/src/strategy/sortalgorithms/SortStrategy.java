package strategy.sortalgorithms;

public class SortStrategy {
    private Sort sortStrategy;

    public void setSort(Sort sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    public double [] sortStrategy(double[] data){
        return sortStrategy.sort(data);
    }
}
