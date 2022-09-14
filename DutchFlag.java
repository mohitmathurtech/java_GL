/**
 * 
 * 
 * 
*/
import java.util.Arrays;

class DutchFlag{
	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		System.out.println("Array  : " + Arrays.toString(threePointer(arr)));	
	}
	 public static int[] threePointer(int[] arr)
	 {
	 	int temp,
	 		start = 0,
	 		mid = 0,
	 		end = arr.length - 1;

	 	while(mid <= end)
	 	{
	 		switch(arr[mid])
	 		{
	 			case 0 : //swap(arr[mid], arr[start]);
	 				 	temp = arr[mid];
	 				 	arr[mid] = arr[start];
	 					arr[start] = temp;
	 				 	start++;
	 				 	mid++;
	 					break;

		 		case 1 :mid++;
			 			break;
		 		case 2 : //swap(arr[mid], arr[end]);
	 				temp = arr[mid];
	 				arr[mid] = arr[end];
	 				arr[end] = temp;
	 				mid++;
	 				end--;
	 				break;
	 		}
	 	}
	 	return arr;
	 }

}
