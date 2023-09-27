public class SumAverageRunningInt3 {
    public static void main(String[] args) {
        int sum=0;
        double average;
        int count=0;
        for(int i = 111; i<= 8899; i++){
            sum +=i;
            count++;
        }
        average = sum/count;
        System.out.println("The sum of 111" +" to 8899 is " + sum);
        System.out.println("The average is " + average);
    }
}
