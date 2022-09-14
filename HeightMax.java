import java.util.Arrays;

/**
 *  Given n non-negative integers representing the height of the building with a
 *  width of each building as 1, compute how much water it is able to trap after raining.
 *
 *  Input: arr[]   = {3, 0, 2, 0, 4}
 *  Output: 7
 *
 *  Approach
 *  Calculate Max to  left()
 *  Calculate max to right()
 *  minArr = Min ( leftArr,  rightAr4r )
 *
 *  subtract input from minArr
 *  and sum of all arr
 */
public class HeightMax {
    public static void main(String[] args) {
        int[] arr = {3,0,2,0,4};
        System.out.println("Input Array :" + Arrays.toString(arr));
        System.out.println("OUTPUT Height : " +heightCalculate(arr));
    }
    public static int heightCalculate(int[] arr){
        int[] maxLeftArr = new int[arr.length]; //to store max left array
        int[] maxRightArr= new int[arr.length]; // to store max right array
        int[] minArr= new int[arr.length];      // to store minimum of left and right array

        int i , n = arr.length ;
        int currentMax = arr[0];
        for(i=0;i<n;i++){
            maxLeftArr[i] = Math.max(currentMax, arr[i]);
            currentMax = Math.max(currentMax, maxLeftArr[i]);
        }
        System.out.println("Max left array:  "+Arrays.toString(maxLeftArr));

        //now for right side
        currentMax = arr[n-1];
        for(i=n;i>0;i--){
            maxRightArr[i-1] = Math.max(currentMax, arr[i-1]);
            currentMax = Math.max(currentMax, maxRightArr[i-1]);
        }
        System.out.println("Max Right array:  "+Arrays.toString(maxRightArr));

        for(i=0;i<n;i++){
            minArr[i] = (Math.min(maxLeftArr[i],maxRightArr[i])) - arr[i];
        }

        System.out.println("Minimum of Left and Right array:  "+Arrays.toString(minArr));
        return sumArray(minArr);
    }
    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
