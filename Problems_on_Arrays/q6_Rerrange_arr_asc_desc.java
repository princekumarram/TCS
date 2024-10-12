//Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

import java.util.Arrays;
import java.util.*;

public class q6_Rerrange_arr_asc_desc {

    public static void main(String[] args) {
        int arr[] = { 8, 7, 1, 6, 5, 9 };
        int n = arr.length;

        Arrays.sort(arr);

        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int i = n - 1; i >= mid; i--) {
            System.out.println(arr[i] + " ");
        }

    }

}
