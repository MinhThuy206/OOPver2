package polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {

    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double coeff : coeffs) {
            coefficients.add(coeff);
        }
    }

    @Override
    public double[] coefficients() {
        double[] coeffsArray = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffsArray[i] = coefficients.get(i);
        }
        return coeffsArray;
    }

    @Override
    public double coefficient(int x) {
        if (x >= 0 && x < coefficients.size()) {
            return coefficients.get(x);
        } else {
            return 0.0;
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        List<Double> derivativeCoeffs = new ArrayList<>();
        for (int i = 1; i < coefficients.size(); i++) {
            derivativeCoeffs.add(i * coefficients.get(i));
        }
        return new ListPoly(derivativeCoeffs.stream().mapToDouble(Double::doubleValue).toArray());
    }
}
