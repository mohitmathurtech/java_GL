/**
*  Class dated 25 August
* sorting algorithms 
*/

//------------>		Binary search need sorted array 


//------------>		Bubble-Sort : 
//( first we sort adjacent elements and swap if they are out of order)
/**
* need 2 iteration to
* time complexity O(n^2)
*
  -------------> 	Selection sort
 * 
 * Select the minimum value from array put at first position then next minimum put and put at next position and so on
 * 
 * 
 *------------->	Merge sort divide and conquer approach
 * 
 * 

public class 25August{



mergeSort(int arr[], int left, int right) {
	if(left < right){
		int mid = (left+right)/2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		merge(arr, left, mid, right)
	}
}


merge(int arr[], int left, int mid, int right){
	
	int size1 = mid - left + 1;
	
	int size2 = right - mid;
	
	
	int L[] = new int [size1]
	int R[] = new int [size2]
	
	for( int i = 0 ; i < size1 ; i++ ){
		L[i] = arr[left+i];
	}
	
	for(int i = 0 ; i < size2; i++){
		R[i] = arr[mid+1+i]
	}
	
	int i = 0,
		j = 0,
		k = left;
	
	//Merging left and right array
	while( i < size1  &&  j < size2 ) {
		if( L[i] <= R[j] ){
			arr[k] = L[i];
			i++; k++;
		}
		else {
			arr[k] = R[j];
			j++; k++;
		}
	}
	
	
	//To check if an element is left in left array
	
	while( i < size1 ){
		arr[k] = L[i];
		i++; 
		k++;
	}
	
	
	// To check if an element is left in Right array
	
	while( j < size2 ){
		arr[k] = R[j];
		j++; 
		k++;
	}		
}


}
*/

import java.util.Arrays;

public class Demo25August {
	public static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length ; i++){
			for(int j = i; j < arr.length; j++){
				if(arr[i] >= arr[j]){
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp; 				
				}
			}
		}
	}

	public static void selectionSort(int[] arr){
		int i,j,n = arr.length;
		int currentMin;
		for(i=0;i<n;i++){
			currentMin = arr[i];
			for(j=i;j<n;j++){
				if(arr[j] < currentMin){
					currentMin = arr[j];
					//swap with arr [i]
					int temp = arr[i];
					arr[i] = arr [j];
					arr[j] = temp;
				}
			}
		}
	}

	//merge Sort 
	public static void mergeSort(int[] arr, int left, int right){
		int mid = (left + right) / 2;
		if(left < right)
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left,mid,right);
	}

	public static void merge(int[] arr, int left, mid, int right){
		int size1 = mid - left - 1;
		int size2 = right - mid; 

		int[] L = new int[size1];
		int[] R = new int[size2];

	}

	public static void main(String[] args) {
		int[] arr = {6,8,9,5,2,1,4,7};
		System.out.println("Before Sorting : \n"  + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After Sorting : \n"  + Arrays.toString(arr));
	}

}
