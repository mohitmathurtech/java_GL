import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,1,6};
        System.out.println("input array is : " + Arrays.toString(arr));
        System.out.println(" Missing Number is : " + missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int n = arr.length;
        int sumOfElements = (n * (n+1))/2 , i;
        for(i=0;i<n;i++ ){
            sumOfElements -= arr[i];
        }
        if(sumOfElements == 0){
            return n + 1;
        }
        return sumOfElements;
    }
}
