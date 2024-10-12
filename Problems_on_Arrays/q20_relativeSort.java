// Sort an array according to the order defined by another array

import java.util.*;

public class q20_relativeSort {

    public static void sortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int temp[] = new int[n];

        Arrays.sort(arr1);
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            temp[i] = arr2[i];

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] != arr2[j]) {
                    temp[m + i] = arr1[i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };

        int arr2[] = { 2, 1, 8, 3 };

        sortArray(arr1, arr2);
    }
}
