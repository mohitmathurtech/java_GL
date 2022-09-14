import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

/**
 * Shift an array by K places towards the right
 * Input: [1,2,3,4,5,6,7] k = 2
 * Output: [6,7,1,2,3,4,5]
 */
public class ShiftArrayElemenrts {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =2;
        shiftArray(arr , k);
    }
    public static void shiftArray(int[] arr, int k){
        int n = arr.length;
        int[] p1 = new int[n-k];
        int[] p2 = new int[k];
        for(int i=0; i < n-k; i++){
            p1[i]=arr[i];
        }
        for(int i=k; i>0 ; i--){
            p2[i-1]=arr[n-i];
        }
        System.out.println("Array 1 " + Arrays.toString(p1));
        System.out.println("Array 2 " + Arrays.toString(p2));
        System.out.println(Arrays.toString(p2) + Arrays.toString(p1));
    }
}
