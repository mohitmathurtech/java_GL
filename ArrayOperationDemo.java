/**
 *
 * Traversal;
 *
 * Insertion,  > adding as last element
 *             > adding at given index > includes shifting array elments and adding at the gioven index
 * Deletion    > deletion of last element
 *             > Deletion of random element by given index
 * Search   > by index
 *          > by position
 *          > by element
 *
 */
public class ArrayOperationDemo {
    int[] arr;
    int capacity;
    int size;

    // constructor to initialize the object
    ArrayOperationDemo(int capacity){

        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    //Insertion at end
    void insertAtEnd(int element){
        arr[size++] = element;
    }

    //insert at index
    void insertAtIndex(int element, int index){
        if(size == capacity)
            return;
        for(int i = size; i>= index;i--){    //right shift operation
            arr[i+1] = arr[i] ;
        }
        arr[index] = element;
        size++;
    }

    // delete at end
    int deleteAtEnd(){
        int deletedElement = arr[size-1];
        arr[size - 1] = 0;
        size--;
        return deletedElement;
    }

    //deletion at given index
    int deleteAtIndex(int index){
        if (index > size)
            return 0;
        int deletedElement = arr[index];
        for(int i = index; i< size; i++)
            arr[i+1] = arr[i];
        arr[size--] = 0;
        return deletedElement;
    }

    //traversal
    void traversal(){
        System.out.println("\n Array :");
        for(int i = 0; i < size; i++)
            System.out.print(" "+ arr[i]);
        System.out.println(" \n ");
    }

    //main function
    public static void main(String[] args) {
        ArrayOperationDemo arrayDemo = new ArrayOperationDemo(10);
        arrayDemo.insertAtEnd(10);
        arrayDemo.insertAtEnd(20);
        arrayDemo.insertAtEnd(30);
        arrayDemo.insertAtEnd(40);
        arrayDemo.insertAtEnd(50);
        arrayDemo.traversal();
        arrayDemo.insertAtIndex(15,1);
        arrayDemo.traversal();
        //System.out.println("Deleted Element " + arrayDemo.deleteAtEnd());
        //arrayDemo.deleteAtIndex(3);
        //arrayDemo.traversal();
    }
}
