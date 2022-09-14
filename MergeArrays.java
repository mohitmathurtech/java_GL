/**
 *  Marge two arrays into single array one by one
 * 
 * arr1 = {1,3,5,7,9}
 * arr2 = {2,4,6,8,10}
 * 
 * 
 * 
 */
import java.util.Arrays;
import java.lang.Math;

public class MergeArrays{

	public static void main ( String[] args ){
		int[] arr1 = {1,2,3,4,5,6};
		//int[] arr2 = {2,4,6,8,10};
		System.out.println("Array 1 : " + Arrays.toString( arr1 ));
		System.out.println(" RESULT  :" + Arrays.toString( rearrangeOrder(arr1)));
		//System.out.println("Array 2 :"  + Arrays.toString(arr2));
		//System.out.println(" RESULT  :" + Arrays.toString(rearrangeOrder(arr2)));
		//System.out.println(" RESULT  :" + Arrays.toString(mergedArr(arr1, arr2)));
	} 
		

	// TWO POINTER APPROACH
	public static int[] rearrangeOrder(int[] arr){
		int i, low = 0, high = arr.length;
		int[] res = new int[high];
		for(i = 0; i < arr.length ; i++){
			if( i % 2 == 0 ){
				res[i] = arr[low];
				low++;
			}
			else{
				res[i] = arr[high - 1];
				high--;
			}
		}
		return res;
			
	}

	//Merging Two independent arrays one after one 
	public static int[] mergedArr(int[] arr1 , int[] arr2){
		int[] result =  new int[Math.max( arr1.length , arr2.length) * 2];
		int i;
		for(i = 0 ; i < arr1.length ; i++ ){
			result [i * 2] = arr1[i];
		}
		for(i = 0 ; i < arr2.length ; i++){
			result[(i*2) + 1] = arr2[i];
		}
		return result;
	}
}

