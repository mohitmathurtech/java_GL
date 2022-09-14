import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Stacks {
    final static int max_size = 5;
    int top = -1;
    int[] stack = new int[max_size];

    public boolean push(int newValue){
        if(top >= max_size){
            System.out.println("Overflow condition occurred!");
        }
        top++;
        stack[top] = newValue;
        return true;
    }

    public int pop(){
        if(top < 0){
            System.out.println("Underflow condition occurred");
            return -1;
        }
        int removedValue = stack[top];
        top--;
        return removedValue;
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public int peek(){
        if(top <= 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public void printStackElements(){
        System.out.println("Elements in the stack from the top are ... :- ");
        for (int i = top; i > -1; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackIntroduction {
    public static void main(String[] args) {

    }
}
