import java.util.*;

public class q4_ReverseArray {

    public static void reverseArray(int arr[], int n) {

        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1 };
        reverseArray(arr, n);
    }

}