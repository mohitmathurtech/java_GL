import com.sun.jdi.IncompatibleThreadStateException;

import java.lang.reflect.Array;
import java.math.MathContext;
import java.util.Arrays;

/**
 *  Given prices of stocks price[i] on i th day,
 *  could you compute the max profit that could be computed by doing only 1 transaction
 *
 *
 *  Input: prices[] = {7, 1, 5, 3, 6, 4]
 *  Output: 5
 *  FIND MAX TO THE RIGHT > GET NEW ARRAY ON RIGHT
 *  calculate max PROFIT IN THAT ARRAY after subtraction of arrays
 */
public class PredictionStockPrices {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        //System.out.println("Output : " + predict(arr));
        predictRight(arr);
    }
    public static int predict(int[] arr){
        int n =  arr.length;
        int i, currentLargest;
        int[] rightArr = new int[n];
        for(i=0; i<n; i++){
            currentLargest = arr[i];
            for(int j = i+1; j < n ; j++){
                if(currentLargest < arr[j]){
                    currentLargest = arr[j];
                }
                rightArr[i] = currentLargest;
            }
        }
        rightArr[n-1] = arr[n-1];
        System.out.println("Right  Array is  " + Arrays.toString(rightArr));
        System.out.println("Original array" + Arrays.toString(arr));
        System.out.println("Before Subtraction array" + Arrays.toString(rightArr));
        for (i=0; i< n; i++){
            rightArr[i] -= arr[i];
        }
        System.out.println("After subtraction array" + Arrays.toString(rightArr));

        Arrays.sort(rightArr);
        System.out.println("Min value "+rightArr[0]);
        System.out.println("Max value "+rightArr[n-1]);

        return rightArr[n-1];
    }

    public static void predictRight(int[] arr){
        int n = arr.length; //6
        int[] right = new int[n];
        int i, max = arr[0];
        for(i=0; i<n; i++){
            if(i==0){
                max = arr[i];
                right[i] = Math.max(max,arr[i]);
            }
            right[i] = Math.max(max, arr[i]);
            max =Math.max(arr[i], max);
        }
        System.out.println("OUTPUT  " + Arrays.toString(right));
    }
}
