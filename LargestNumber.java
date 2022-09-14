import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Find the largest element towards the left and right of each element in an unsorted array.
 * If there is no element larger than the current element, fill it with -1
 *
 * Example Input: [4,2,1,3,6,4]
 *
 * Output: Largest element on left [-1,4,4,4,6,6]
 *
 * Largest element on right [6,6,6,6,6,-1]
 *
 */

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr =  {4,2,1,3,6,4};
        System.out.println("input Array is : " + Arrays.toString(arr));
        toCheckLeftSide(arr);
        checkRightSide(arr);
    }

    public static void toCheckLeftSide(int[] arr){
        int n =  arr.length;
        int i, currentLargest = 0 ;
        int[] leftArr = new int[n];
        for(i=0; i<n; i++){
            if(i == 0){
                leftArr[i] = arr[i];
                currentLargest = arr[i];
            }
            else{
                leftArr[i] =  Math.max(arr[i],currentLargest);
                currentLargest = Math.max(arr[i],currentLargest);
            }
        }
        leftArr[0] = -1;
        System.out.println(" Left  Array is  " + Arrays.toString(leftArr));
    }
    public static void checkRightSide(int[] arr){
        int n =  arr.length;
        int i, currentLargest = 0 ;
        int[] rightArr = new int[n];
        for(i=n-1; i>=0; i--){
            if(i == n-1){
                rightArr[i] = arr[i];
                currentLargest = arr[i];
            }
            else{
                rightArr[i] =  Math.max(arr[i],currentLargest);
                currentLargest = Math.max(arr[i],currentLargest);
            }
            //
        }
        rightArr[n-1] = -1;
        System.out.println(" Right  Array is  " + Arrays.toString(rightArr));
    }
}
