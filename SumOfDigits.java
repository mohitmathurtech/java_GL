/*
    To find the sum of first n digits
    n will be input bu scanner class
 */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter the number");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println("Entered number is : " + num);

        System.out.println("Sum of the digits : "+ sum(num));

    }

    // to find the sum of digits + Recurrsion
    public static int sum(int num){
        //base condition
        if (num == 0) {
            return num;
        }
        return (num % 10) + sum(num /10);
    }
}
