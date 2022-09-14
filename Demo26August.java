/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same 
 * length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 * 
*/
import java.util.Arrays;

public class Demo26August{
    public static void main(String[] args) {
        int[] arr = new int[5];
        // first cycle: 3
        arr[0] = 2;
        arr[1] = 0;
        arr[2] = 1;
        
        // second cycle : 2
        arr[3] = 4;
        arr[4] = 3;

        // [1, 2, 0]

        int[] ans = new Demo26August().buildArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    int[] buildArray(int[] nums) {
        int idx = 0;
        while(idx < nums.length) {
            int saveVar = idx;
            if (nums[idx] >= 0) {
                int save = idx;
                int saveNum = nums[save];
                while (nums[idx] != save) {
                    int temp = nums[idx];
                    nums[idx] = -1 * nums[nums[idx]];
                    if (nums[idx] == 0) {
                        nums[idx] = Integer.MIN_VALUE;
                    }
                    idx = temp;
                }
                nums[idx] = -1 * saveNum;
                if (nums[idx] == 0) {
                    nums[idx] = Integer.MIN_VALUE;
                }
            }
            idx = saveVar + 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE) {
                nums[i] = 0;
            } else {
                nums[i] =  -1 * nums[i];
            }
        }
        return nums;
    }
}    

