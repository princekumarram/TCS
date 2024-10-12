import java.util.*;

public class q18_Sort_Elements_of_Array_by_Frequency {

    public static void swap(int[][] arr, int i, int j) {
        int temp1 = arr[0][i];
        arr[0][i] = arr[0][j];
        arr[0][j] = temp1;

        int temp2 = arr[1][i];
        arr[1][i] = arr[1][j];
        arr[1][j] = temp2;

    }

    // function to sort 2d array by frequency
    public static void sort2darray(int[][] arr2d, int k) {
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - 1 - i; j++) {
                if (arr2d[1][j] < arr2d[1][j + 1]) {
                    swap(arr2d, j, j + 1);
                }
            }
        }
    }

    public static void Sortele(int arr[], int n) {
        // step-1 : Sort the Array
        Arrays.sort(arr, 0, n);
        // step-2: Create q 2d array

        int[][] arr2d = new int[2][100];
        int k = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr2d[0][k] = arr[i];
                count = 1;
            } else if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                arr2d[1][k] = count;
                count = 1;
                k++;
                arr2d[0][k] = arr[i];
            }
        }
        arr2d[1][k] = count;
        k++;

        // step 3:sort the 2d array according to frequency
        sort2darray(arr2d, k);

        // step 4: Store the answer in original array
        k = 0;
        int i = 0;
        while (i < n) {
            while (arr2d[1][k] > 0) {
                arr[i] = arr2d[0][k];
                i++;
                arr2d[1][k]--;
            }
            k++;
        }

    }

    public static void main(String args[]) {
        int n = 8;
        int[] arr = { 1, 2, 3, 2, 4, 3, 1, 2 };
        Sortele(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
