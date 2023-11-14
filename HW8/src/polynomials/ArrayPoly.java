package polynomials;

public class ArrayPoly extends AbstractPoly{

    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return coefficients.clone(); // Return a copy to protect encapsulation
    }

    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree < coefficients.length) {
            return coefficients[degree];
        } else {
            return 0.0; // or throw an exception, depending on your requirements
        }
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoeffs = new double[coefficients.length - 1];
        for (int i = 1; i < coefficients.length; i++) {
            derivativeCoeffs[i - 1] = i * coefficients[i];
        }
        return new ArrayPoly(derivativeCoeffs);
    }
}
