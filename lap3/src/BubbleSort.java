import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,6,3,9,5,7,8};
        int[] arrSort = bubbleSort(arr);
        System.out.println(Arrays.toString(arrSort));
    }

    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for(int i =0;i <len;i++){
            for(int j =0; j<len-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
