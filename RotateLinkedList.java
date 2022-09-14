class LinkedList {
    LinkedList next;
    int val;
    public LinkedList(int val) {
        this.val = val;
        this.next = null;
    }
}
public class RotateLinkedList {

    public static void main(String[] args) {
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        LinkedList newHead = new RotateLinkedList().Rotate(head, 2);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

public LinkedList Rotate(LinkedList head, int k)
    {
        if (head == null) {
            return head;
        }
        // step1 - trying to find the length of linked list
        int count = 0;
        LinkedList temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // step2 - modulus operand (remainder)
        k = k % count;

        // step3 - trying to find the pivot point
        int cut = count - k;
        LinkedList firstHalf = head;

        while (cut > 1) {
            cut--;
            firstHalf = firstHalf.next;
        }
// step-4 : arranging pointers
        LinkedList secondHalf = firstHalf.next;
        firstHalf.next = null;

        LinkedList temp1 = secondHalf;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
temp1.next = head;
        return secondHalf;
    }
}
