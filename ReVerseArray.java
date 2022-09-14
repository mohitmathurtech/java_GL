import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * To Reverse am array with given indexes
 */

public class ReVerseArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        reverse(arr,0,5);
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(3);
        a.add(2);
        System.out.println("List elements " + a.toString());
        System.out.println("List elements " + reverseList(a).toString());

    }
    public static List<Integer> reverseList(List<Integer> a)
    {
        int length = a.size();
        for (int i =0; i< length/2; i++){
            int temp = a.get(i);
            a.set(i,a.get(length-i-1));
            a.set(length-i-1, temp);
        }
        return a;
    }

    public static void reverse(int[] arr, int start, int end){
        System.out.println("INPUT ARRAY" + Arrays.toString(arr));
        int n = arr.length, i;
        if( end > n ){
            System.out.println("Incorrect end index");
            return;
        }
        for(i = start; i <= end/2; i++){
            int temp = arr[end - i];
            arr[end - i] = arr[start + i];
            arr[start + i] = temp;
        }
        System.out.println("Output ARRAY" + Arrays.toString(arr));
    }
}
