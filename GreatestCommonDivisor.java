/**
 * To find the GCD   28 July 2022
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("GCD of 12 , 24 is " + gcd(12,24));
    }
    public static int gcd(int a, int b)
    {
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        if(a == b)
            return a;
        if(a > b)
            return(gcd(a-b,b));
        return gcd(a, b-a);
    }
}
