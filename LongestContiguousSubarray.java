/**
 *    
 Given an array containing n numbers. 
 
 The problem is to find the length of the longest contiguous subarray such that 

 every element in the subarray is strictly greater than its previous element in the same subarray. 

Time Complexity should be O(n).

Input : arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2}

Output : 5

The subarray is {3, 5, 7, 8, 9}

 

Input : arr[] = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11}

Output : 4

The subarray is {4, 7, 8, 10}
 * 
 * 
 */

class LongestContiguousSubarray
{
	public static void main(String args[])
	{
		int[] arr = {5, 6, 3, 5, 7, 8, 9, 1, 2};
		System.out.println(" Longest subarray with req conditions is of length " + longestSubArray(arr));
	}
	public static int longestSubArray(int[] arr)
	{
		int n = arr.length;
		int i , 
			start  = 0, 
			end = 1,
			currentMaxSize = 0,
			globalMax = 0;
		for(i = 1; i < n; i++)
		{
			if(arr[i-1] < arr[i]){
				end++;
				currentMaxSize = end - start + 1;
				if(globalMax < currentMaxSize)
				{
					globalMax = currentMaxSize;
				}
			}
			else
			{
				currentMaxSize = 0;
				start = i ;
				end = i;
			}
		}
		return globalMax;
	}
}