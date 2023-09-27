public class OddEvenNumber {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        if (sumEven > sumOdd) {
            absDiff = sumEven - sumOdd;
        } else {
            absDiff = sumOdd - sumEven;
        }

        System.out.println("The sum of odd number is " + sumOdd);
        System.out.println("The sun of even number is " + sumEven);
        System.out.println("The diff is " + absDiff);
    }
}
