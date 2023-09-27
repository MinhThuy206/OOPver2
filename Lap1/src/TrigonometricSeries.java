public class TrigonometricSeries {
    public static double factorial(double x, int numTerm){
        double result = 1.0;
        for(int i = 1; i<= numTerm; i++){
            result *= x / i;
        }
        return result;
    }

    public static double power(double x, int n){
        if(n == 0){
            return  -1.0;
        }

        double result = 1.0;
        for(int i = 1; i<= n; i++){
            result *= x;
        }
        return result;
    }
    public static double sin(double x, int numTerms){
        double sum = 0.0;
        for(int term = 1; term <= numTerms; term+=2){
            if(term % 4 == 1){
                sum += 1.0/ factorial(x, term);
            }else if(term % 4 == 3){
                sum -= 1.0/ factorial(x, term);
            }else{
                System.out.println("Impossible");
            }
        }
        return sum;
    }

    public static double calculateSin(double x, int numItem){
        double result = 0.0;
        double term = x;
        for(int i =0; i<= numItem; i++){
            result += term;
            term = (-1.0) * term * (x*x) / (2*i*(2*i+1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sin(3.0, 100));
        System.out.println(Math.sin(3.0));
        System.out.println(factorial(3.0,2));
    }
}
