/**
 *      To check the concept of DYNAMIC ARRAY
 *      TANZEEN MAAM CONTENT VIDEO
 *
 */

public class DynamicArray {
    int[] arr;
    int size;
    int capacity;

    DynamicArray(int capacity){
        this.capacity = capacity;
        arr =  new int[capacity];
        size = 0;
    }

    void insert(int element){
        if(size == capacity){
            growArray();
        }
        arr[size++] = element;
    }

    void growArray(){
        int[] temp = new int[2*size];
        for(int i= 0; i < size; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        capacity = 2*size;
    }

    int delete(int index){
        if(index >= size){
            return 0;
        }
        int deletedElement = arr[index];
        for(int i = index+1; i<size; i++)
            arr[i-1] =arr[i];
        size--;
        return deletedElement;
    }

    void display(){
        System.out.println("Array with size" );
        for (int i = 0; i < size; i++){
            System.out.print( " "  + arr[i]);
        }
        System.out.println(" \n \n Array with capacity");
        for (int i = 0; i < capacity; i++){
            System.out.print( " "  + arr[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArray dr = new DynamicArray(3);
        dr.insert(10);
        dr.insert(20);
        dr.insert(30);
        dr.insert(40);
        dr.insert(50);
        dr.display();
        System.out.println("\n\n Deleted Element is : " + dr.delete(2));
        dr.display();
    }
}