import java.util.Arrays;

/**
 * Using Dynamic Programing and backtracking both
 *
 */
public class Factorial {
    public static int factorialDynamic(int n)
    {
        int arr[] = new int[n+1];
        arr[0] = 1;
        for (int i = 1; i <=n; i++){
            arr[i] = i * arr[i-1];
        }
        System.out.println("Array is "+ Arrays.toString(arr));
        return arr[n];
    }

    public static int factorialBackTracking(int n){
        if(n==1)
            return 1;
        else
            return n * factorialBackTracking(n-1);
    }
    public static void main(String[] args) {
        System.out.println(" dynamic Programming O/P = " + factorialDynamic(5));
        System.out.println(" BackTracking O/P = " +factorialBackTracking(5));
    }
}

/**
 * Let me illustrate Memoization through an example:
 *
 * Here is a simple example of computing the nth Fibonacci of a number:
 int fib(int n)
 {
    if (n <= 1)
        return n;
    return fib(n-1) + fib(n-2);
 }
  *\
 * The above code uses recursion to solve sub-problems (fib(n-1) and fib(n-2))
 * so that fib(n) can be solved in the end.
 * It assumes that fib(n-1) and fib(n-2) are already solved in the way that it is structured.
 *
 * Though this code looks elegant, the running time is exponential,
 * because you can solve fib(i), where i is a number less than n, multiple times.
 *
 * To avoid the unnecessary re-computation, Memoization is used to optimizes run-time by using
 * memory.
 *
 * Here is an optimized example of computing the nth Fibonacci number using Memoization:
 *
 * int fib(int n)
 *  {
 *    /* just like the array you declared in your solution */
 /*      int f[n+1];
         int i;
         //set up the base cases, just like how you set f[0] to 1
         f[ 0 ] = 0;
         f[ 1 ] = 1;
         for(i=2;i<=n;i++)
         {
                 /* using previously solved problem to solve further problems
            f[i]=f[i-1]+f[i-2];
         }
               /*return the final result
         return f[n];
         }
 */
