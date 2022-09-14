import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Entered number is : " + num);
        System.out.println("Reverse is :" );
        reverse(num);

    }

    public static void reverse(int num){
        if (num < 10 ) {
            System.out.print(num);
            return;
        }
        System.out.print(num%10);
        reverse(num /10);
    }
}
