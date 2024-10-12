import java.util.Arrays;

public class q7_Rotate_array_by_K_elements {

    public static void BlockSwap(int arr[], int k, int n) {
        int temp[] = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        int k = 2;
        BlockSwap(arr, k, n);
        System.out.println("After Rotating the array ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
