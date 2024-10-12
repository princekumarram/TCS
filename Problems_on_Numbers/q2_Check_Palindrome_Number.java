public class q2_Check_Palindrome_Number {

    public static boolean isPalindrome1(int a) {

        int reverse = 0;
        int dup = a;
        while (a > 0) {
            int ans = a % 10;
            reverse = (reverse * 10) + ans;
            a = a / 10;

        }
        if (dup == reverse)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int a = 121;

        System.out.println(isPalindrome1(a));
    }

}
