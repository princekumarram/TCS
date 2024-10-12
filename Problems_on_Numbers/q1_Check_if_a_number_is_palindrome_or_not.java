import java.util.Stack;

public class q1_Check_if_a_number_is_palindrome_or_not {

    public static boolean isPalindrome1(int arr[], int n) {

        // for (int i = 0; i < n; i++) {
        // boolean found = false;
        // for (int j = n - 1; j > 0; j--) {

        // if (arr[i] == arr[j]) {
        // found = true;
        // }

        // }
        // if (!found)
        // return false;
        // }
        return true;
    }

    public static boolean isPalindrome2(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];

        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == temp[i])
                found = true;

            if (!found)
                return false;
        }

        return true;
    }

    public static boolean isPalindrome3(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(arr[i]);
        }

        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = st.pop();
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == temp[i])
                found = true;

            if (!found)
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1, 3 };

        System.out.println(isPalindrome3(arr));

    }

}