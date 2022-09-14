/**
 * The Kth MEX of an array is equal to the Kth smallest
 * non-negative integer that is not present in the array.
 *
 * N = 4, K = 3,
 * A = { 7, 5, 7, 1 }
 * Output: 3
 * Explanation: The values which are not present in
 * A are: 0, 2, 3, 4, 5..., out of which the 3rd
 * samllest value is 3.
 *
 *
 * N = 1, K = 1,
 * A = { 2 }
 * Output: 0
 * Explanation: The values which are not present in
 * A are: 0, 1, 3, 4, 5..., out of which 0 is the
 * samllest value.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class SolutionGeekFG {
    public static void main(String[] args) {
        int[] arr = {5,13,1,19,5,0,3,12,17,9};
        int k = 3, n=10;
        System.out.println("output"  + kthMex(n,k,arr));
    }
        static int kthMex(int n, int k, int arr[]) {
            // add your code here
            int[] result = new int[n];
            Arrays.sort(arr);
            int counter =0;
            System.out.println(Arrays.toString(arr));


            System.out.println(Arrays.toString(result));
            return result[k-1];
        }
}
