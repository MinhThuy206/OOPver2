import java.util.Locale;

public class NumberSystemConversion {
    public static void main(String[] args) {
//        double [] poly = {1,2,3,4};
//        int x = 3;
//        double  polyValue = evaluatePolyUsingHornerAlgorithm(poly, x);
//        System.out.println(polyValue);
        System.out.println(convertRadixNtoDecimal("1011",2));

    }

    public static double evaluatePolyUsingIterativeMethod(double [] poly, int x){
        double polyValue = 0;
        double exp = 0.0;
        for(int i=0;i<poly.length;i++){
            polyValue += poly[poly.length-1-i]*exp;
            exp = exp *x;
        }
        return polyValue;
    }

    public static double evaluatePolyUsingHornerAlgorithm(double[] poly, int x){
        double polyValue = 0;
        for(int i =0;i< poly.length;i++){
            polyValue += polyValue * x + poly[i];
        }
        return polyValue;
    }

    public static int convertRadixNtoDecimal(String number, int radix){
        if(number == null){
            return -1;
        }
        number = number.toUpperCase(Locale.ROOT);
        int decimal = 0;
        for(int i=0;i<number.length();i++){
            decimal = decimal * radix + valueOfDigit(number.charAt(i));
        }
        return decimal;
    }

    public static int valueOfDigit(char digit){
        final String DIGITS = "0123456789ABCDEF";
        return DIGITS.indexOf(digit);
    }
}
