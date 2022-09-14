/**
 * Kadanes Algo to find sum of contigious Subarray
 */
public class KadaneContiguousSubarray {
    public static void main(String[] args) {
        //int[] arr = {1-2,3,2,-6,4};
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(("Max Sum is " + sum(arr) ));

    }
    public static int sum(int[] arr){
        int globalSum = Integer.MIN_VALUE;
        int localsum = 0;
        for (int i = 0; i< arr.length; i++){
            localsum += arr[i];
            globalSum = Math.max(localsum, globalSum);

            if(localsum < 0){
                localsum = 0;
            }
        }
        return globalSum;
    }
}
