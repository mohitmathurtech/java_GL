/**
 * Kadane Algorithm:
 * to find the Maximum sum of largest subarray
*/
import java.util.Arrays;
import java.lang.Math;

class KadaneAlgo
{
	public static void main(String[] args)
	{
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Array  : " + Arrays.toString(arr));
		System.out.println("Largest Sum  : " + largestSum(arr));
	}

	public static int largestSum(int[] arr)
	{
		int n = arr.length;
		int localSum = 0; 
		int globalSum = 0;

		for(int i =0 ; i < n ; i++)
		{
			localSum += arr[i];
			globalSum = Math.max(globalSum, localSum);

			if(localSum < 0)
			{
				localSum = 0;
			}
		}
		return globalSum;
	}


}