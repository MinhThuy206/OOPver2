package polynomial;

public class TestMain {
    public static void main(String[] args) {
        double[] coeffs1 = {1.1, 2.2, 3.3};
        double[] coeffs2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        MyPolynomial myPolynomial1 = new MyPolynomial(coeffs1);
        MyPolynomial myPolynomial2 = new MyPolynomial(coeffs2);
        System.out.println(myPolynomial1);

        System.out.println(myPolynomial1.evaluate(2));
        MyPolynomial add = myPolynomial1.add(myPolynomial2);
        System.out.println(add);
        MyPolynomial multiply = myPolynomial1.multiply(myPolynomial2);
        System.out.println(multiply);
    }
}
