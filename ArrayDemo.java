/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * 
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order. 

Example 

Input: nums1 = [0,0,0,1,2,3], m = 3, nums2 = [2,5,6], n = 3 

Output: [0,0,0,1,2,2,3,5,6]  
*/

import java.util.Arrays;

class ArrayDemo{
	public static void main(String args[])
	{
		int[] nums1 = {0,0,0,1,2,3};
		int[] nums2 = {2,5,6};
		int[] arr = {1, 5, 3, 6, 4};
		//int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(" Merged Array  : " + Arrays.toString(mergeArray(nums1, nums2)));
		//System.out.println(" Array  : " + Arrays.toString(nums1));
		//System.out.println(" Reversed Array  : " + Arrays.toString(reverseArray(nums1)));
		//System.out.println("         Array  : " + Arrays.toString(arr));
		//System.out.println("Max to right from 0 index of Array  : \n " + Arrays.toString(maxToRight(arr)));
		//System.out.println("Max to left from 0 index of Array   : \n " + Arrays.toString(maxToLeft(arr)));
	}

	public static int[] mergeArray(int[] n1, int[] n2)
	{	int m = n1.length;
		int n = n2.length;
		int[] res = new int[m + n];
		System.out.println("ARRAY 1 : " + Arrays.toString(n1));
		System.out.println("ARRAY 2 : " + Arrays.toString(n2));
		int i = 0,
			j = 0,
			k = 0;
		// merge two arrays
		while( i<m && j<n) {
            if( n1[i] <= n2[j] ){
                res[k] = n1[i];
                i++;
                k++;
            }
            else {
                res[k] = n2[j];
                j++;
                k++;
            }
        }

        while( i < m )
        {
            res[k] = n1[i];
            i++;
            k++;
        }
        while( j < n ){
            res[k] = n2[j];
            j++;
            k++;
        }

		return res;
	}
	
	public static int[] reverseArray(int[] arr)
	{
		for(int i = 0; i < arr.length/2; i++)
		{
			int temp = arr[arr.length -i - 1];
			arr[arr.length -i - 1] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static int[] reverseArray(int[] arr, int x, int y)
	{
		int n = arr.length;
		if((x<n) && (y<=n))
		{
			for (int i = 0 ; i <= (y-x) / 2 ; i++)
			{
				int temp  = arr[y-1-i];
				arr[y-1-i]= arr[x-1+i];
				arr[x-1+i]= temp;
			}
			return arr;	
		}
		else
		{
			System.out.println(" Array index are incorrect");
			return arr;
		}
	}

	public static int[] maxToRight(int[] arr)
	{
		int[] res = new int[arr.length];
		int n = arr.length;
		int i , currMax = arr[0];
		for(i = n-1; i >=0 ; i--)
		{
			if(i == n-1)
			{
				currMax = arr[i];
				res[i] = currMax;
			}
			else 
			{
				res[i] = Math.max(currMax,arr[i]);
				currMax = Math.max(currMax, arr[i]);	
			}
			
		}
		return res;
	}
	public static int[] maxToLeft(int[] arr)
	{
		int n = arr.length;
		int currMax = 0;
		int[] res = new int[n];
		for(int i = 0; i< n; i++)
		{
			if(i == 0)
			{
				currMax = arr[i];
				res[i] =currMax;
			}
			else 
			{
				res[i] = Math.max(currMax,arr[i]);
				currMax = Math.max(currMax,arr[i]);
			}
		}
		return res;
	}
}