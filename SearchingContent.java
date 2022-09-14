import java.sql.SQLOutput;

/**
 * Searching
 * 1 Linear Search  ----> Return True or False
 *                        weather the element is present in the array or not
 *                        Time Complexity O(n);
 *
 * 2 Binary Search ----->           Conditions
 *   (DIVIDE N CONQUER ALGO)         Array has to be sorted

*/

public class SearchingContent {
    public static void main(String[] args) {
        int[] arr = {2,6,4,58,22,53,29,62,5,1};
        int [] sortedArray = {1,2,3,4,5,6,7,8,9,10,18};
        int target  = 18;
        int start = 0;
        int end = sortedArray.length - 1;
//        System.out.println("Element ot be searched : Target" + target);
//        System.out.println("Result " + linearSearch(arr, target));
        System.out.println("Binary Search + O/p " + binarySearch(sortedArray, start, end, target));
    }
    public static Boolean linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }
    public static Boolean binarySearch(int[] sortedArray, int start, int end, int target){
        System.out.println("Target" + target);
        if(start <= end){
            int mid = start + (end - start) / 2;
//            System.out.println("Middle Value " + sortedArray[mid]);
//            System.out.println("Mid  " + mid + " Start " + start + " End "+ end);
            if(sortedArray[mid] == target)
                return true;
            if(sortedArray[mid] < target)
            {
                //target is in right side of the array from mid
                return binarySearch(sortedArray, mid+1, end, target);
            }else if(sortedArray[mid] > target)
            {
                //target is in left side of the array from mid
                return binarySearch(sortedArray, start,mid -1, target);
            }
        }
        return false;
    }
}
