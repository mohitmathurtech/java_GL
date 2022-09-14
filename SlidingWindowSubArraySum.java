

import java.util.Arrays;

/***
 * To find the max sum of elements from subarray
 * SubArray sliding window
 * arr = {100,200,300,150}
 *
 */

public class SlidingWindowSubArraySum {
    public static void main(String[] args) {
        int[] arr = {100,200,300,150};
        System.out.println(" Input array" + Arrays.toString(arr));
        System.out.println(" Maximum Sum : " + maxSumSubArray(arr, 2));
    }
    public static int maxSumSubArray(int[] arr, int k){
        int golbalMaxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i =0; i< k ; i++){
            sum = sum + arr[i];
        }
        for(int i = k; i < arr.length; i++){
            sum = sum + arr[i] - arr[i-k];
            golbalMaxSum = Math.max(sum, golbalMaxSum);
        }
        return golbalMaxSum;
    }
}
