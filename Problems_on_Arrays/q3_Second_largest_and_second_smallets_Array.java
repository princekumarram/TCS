import java.util.*;
import java.util.Arrays;

public class q3_Second_largest_and_second_smallets_Array {

    // METHOD 1
    // public static void getElements(int arr[], int n) {
    // if (n == 0 || n == 1) {
    // System.out.println(-1);
    // }

    // Arrays.sort(arr);
    // int small = arr[1];
    // int large = arr[n - 2];
    // System.out.println(large);

    // System.out.println(small);
    // }

    // METHOD 2

    public static void getElements(int arr[], int n) {

        if (n == 0 || n == 1) {
            System.out.println(-1);
        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        int i = 0;
        for (i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for (i = 0; i < n; i++) {
            if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }

            if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }

        System.out.println("small is " + secondSmall);
        System.out.println("large is " + secondLarge);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 5 };
        int n = arr.length;
        getElements(arr, n);
    }
}
