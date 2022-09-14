/**
 * MULTIPLE SORTING ALGORITHMS
 * Bubble Sort
 * Selection Sort
 * Merge Sort
 */

import java.util.Arrays;

public class SortingDemo {
    public static void main(String[] args) {
        int[] arr = {23,5,1,4,9,41,5,2};
        int[] arrayDemo = { 8,5,2,3,6,4,7,1};
        //bubbleSort(arr);
        //selectionSort(arr);
        mergeSort(arrayDemo, 0, arrayDemo.length - 1);
        System.out.println(Arrays.toString(arrayDemo));
    }

    //Bubble Sort  TC: O(n^2)
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++){
            for(int j = i ; j < n ; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    /**
     * Selection Sort  TC : O(n^2)
     * select the smallest element and swap with the first then second and so on;
     * till we reach the end
     */
    public static void selectionSort(int[] arr){
        int n = arr.length;
        int min ;

        //to find the minimum value in given array

        for(int i = 0; i < n; i++){
            min = arr[i];
            for(int j = i; j< n;j++){
                if(arr[j] < min){
                    min = arr[j];
                    // swap with arr[i]
                    int temp = arr[i];
                    arr[i] = min;
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * Merge Sort
     * Divide and conquer approach seprate them to left and right array then
     * merge them
     */
    public static void mergeSort(int[] arr, int left, int right){
        System.out.println(Arrays.toString(arr));
        int mid = (left + right)/2;
        if( left < right){
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge( arr, left , mid , right );
        }
    }
    public static void merge(int arr[], int left, int mid, int right){
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;
        int LeftArray[] = new int [sizeLeft];
        int RightArray[] = new int [sizeRight];

        //populate Left Side Array
        for(int i = 0; i < sizeLeft; i++){
            LeftArray[i] = arr[left + i];
        }
        //populate Right Side Array
        for(int i = 0; i < sizeRight; i++){
            RightArray[i] = arr[mid + 1 + i];
        }
        //comparing LeftArray and RightArray elements
        int i = 0,
                j = 0,
                k = left;
        while( i < sizeLeft && j < sizeRight) {
            if( LeftArray[i] <= RightArray[j] ){
                //if left element is small put that in MainArray at k'th position i.e left
                arr[k] = LeftArray[i];
                i++;
                k++;
            }
            else {
                arr[k] = RightArray[j];
                j++;
                k++;
            }
        }
        //after the completion of comparision  if any element left in Left or Right array
        while( i < sizeLeft ){
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while( j < sizeRight ){
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
}