import java.util.Arrays;

// incomplete 9 sept code

public class ZeroEnd {
    public static void main(String[] args) {
        int[] arr = {6,0,6,2,5,0,5,0,0,2,0};
        System.out.println("Output : " + Arrays.toString(countZero(arr)));
    }

    public static int[] countZero(int[] arr)
    {
        int length = arr.length;
        int low = 0, high = length - 1;
        for(int i = 0; i<length; i++)
        {
            if(arr[high] == 0)
            {
                high--;
            }
        }
        return arr;
    }
}
