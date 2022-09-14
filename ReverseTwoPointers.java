import java.util.Arrays;

public class ReverseTwoPointers {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        System.out.println(" Input  Array  "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array " + Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int n =  arr.length;
        int start = 0;
        while (start <= n/2){
            //swap(arr[start], arr[n-1]);
            int temp = arr[start];
            arr[start] = arr[n-1];
            arr[n-1] = temp;
            start++;
            n--;
        }
    }
}
