/**
 * WAP to return largest substring
 */
public class largestSubString {
    public static void main(String[] args) {
        String str = "abcdbabbbacccad";
        System.out.println(subString(str));
    }
    public static String subString(String str)
    {
        int length = str.length();
        String result = new String();
        result = result + str.charAt(0);
        return result;
    }
}
