public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 100000;

        for (int denomianter = 1; denomianter <= MAX_DENOMINATOR; denomianter += 2) {
            if (denomianter % 4 == 1) {
                sum += 1.0 / denomianter;
            } else if (denomianter % 4 == 3) {
                sum -= 1.0 / denomianter;
            } else {
                System.out.println("Impossible");
            }
        }
        System.out.println("The sum is " + 4 * sum);
    }
}
