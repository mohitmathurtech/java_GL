import java.util.Arrays;

/**
 * Array segregation of 0 and 1
 *
 * TWO POINTER APPROACH
 */
public class ArraySepration01 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,0,1,1};
        System.out.println(" Input Array : " + Arrays.toString(arr));
        segregate01(arr);
        System.out.println("Output Array : " + Arrays.toString(arr));
    }
    public static void segregate01(int[] arr){
        int s,e;
        s=0;
        e= (arr.length) - 1;

        while(s < e){
            if(arr[s] ==0 && s < e){
                s++;
            }

            if(arr[e]==1 && s < e){
                e--;
            }

            if(s<e){
                arr[s] = 0;
                arr[e] = 1;
                s++;
                e--;
            }
        }
    }
}
