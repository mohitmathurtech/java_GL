import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * To find the hourglass sum of 2D array
 */
public class TwoDArray {
    public  static int hourGlassSum(List<List<Integer>> arr){
        int rows = arr.size();
        int columns = arr.get(0).size();
        System.out.println("Rows " + rows + " Columns  " + columns );
        return  21;
    }
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();


        //{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("HourGlass sum = " + hourGlassSum(arr));
    }
    public static int sumTimer(int[][] arr)
    {
        int rows = arr.length;
        int columns = arr[0].length;
        int MaxSum = -63;
        for(int i = 0; i< rows - 2; i++){
            for(int j = 0; j< columns - 2; j++)
            {   int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] +
                arr[i+2][j+1] + arr[i+2][j+2];
                MaxSum = Math.max(MaxSum, currentSum);
            }
        }

        return MaxSum;
    }


}
