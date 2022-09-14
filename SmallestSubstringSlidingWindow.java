/***
 * Using SLIDING Window ALgorithm
 * find the largest substring length
 *
 */
public class SmallestSubstringSlidingWindow {
    public static void main(String[] args) {
        String s = "011212";
        System.out.println("Largest substring Length is : " + calculateSubstringLength(s));
    }

    private static int calculateSubstringLength(String s) {
        int n = s.length();                     //Length of the input string
        int ans = Integer.MAX_VALUE;            // Largest possible integer
        int zeroI = 0, oneI = 0, twoI = 0;      // indexes of 0 , 1 and 2
        boolean zeroB = false;                  // to chck weather you have travelled 0,1,2 respectively
        boolean oneB = false;
        boolean twoB = false;

        for(int i = 0;i <n;i++ )
        {
            if(s.charAt(i) == '0')
            {
                zeroB = true;
                zeroI = i;
            }
            else if(s.charAt(i) == '1')
            {
                oneB = true;
                oneI = i;
            }
            else if(s.charAt(i) == '2')
            {
                twoB = true;
                twoI = i;
            }

            // To calculate the length of sub-string
            //  ans = MAx(zeroI,oneI,twoI) - MIN(zeroI,oneI,twoI)

            if(zeroB && oneB && twoB){
                ans = Math.min(ans ,
                        Math.max(zeroI,
                                Math.max(oneI,twoI)) - Math.min(zeroI, Math.min(oneI, twoI)));
            }
        }
        if(ans == Integer.MAX_VALUE){
            System.out.println("String Not found");
            return 0;
        }
        return ans+1;
    }
}
