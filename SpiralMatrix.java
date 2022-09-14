import java.util.Arrays;

/**
 * CLASS CODE
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Matrix");
        System.out.println(Arrays.deepToString(printSpiralOrder(arr, 3,3)));
    }
    public static int[][] printSpiralOrder(int [] arr, int n, int m){
        if(arr == null){
            return null;
        }

        int [][] mat = new int [m][n];

        int top =0, bottom = m-1;
        int left=0, right = n-1;

        int index = 0;

        while(true){
            if(left > right){
                break;
            }

            for(int i=left;i<=right;i++){
                mat[top][i] = arr[index];
                index++;
            }
            top++;
            if(top > bottom){
                break;
            }

            for(int i=top;i<=bottom;i++){
                mat[i][right] = arr[index];
                index++;
            }
            right--;

            if(left>right){
                break;
            }

            for(int i=right;i>=left;i--){
                mat[bottom][i] = arr[index];
                index++;
            }
            bottom--;
            if(top > bottom){
                break;
            }
            for(int i=bottom;i>=top;i--){
                mat[i][left] = arr[index];
                index++;
            }
            left++;

        }
        return mat;
    }
}
