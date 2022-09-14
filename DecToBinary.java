/**
 * 
 * Deciaml to Binary converter
 * 
*/
class LinkedList
{
    LinkedList next;
    int value;

    public LinkedList(int val)
    {
        this.value = val;
        this.next = null;
    }
}
class DecToBinary
{
    public static void main(String[] args) 
    {
        LinkedList head = new LinkedList(2);
        head.next = new LinkedList(4);
        head.next.next = new LinkedList(6);

        while(head != null)
        {
            System.out.println(head.value);
            head = head.next;
        }
    }
}