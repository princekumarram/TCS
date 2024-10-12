
public class q17_Rotate_array_by_K_ele {

    public static void RotatedArrayRight1(int arr[], int n, int k) {

        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;

        int temp[] = new int[k];

        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void RotatedArrayLeft1(int arr[], int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // BY USING THE REVERSE ALGORITHM

    public static void RotatedArrayRight2(int arr[], int n, int k) {

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        int k = 2;

        // RotatedArrayRight1(arr, n, k);
        // RotatedArrayLeft1(arr, n, k);

        RotatedArrayRight2(arr, n, k);
        // RotatedArrayLeft2(arr, n, k);

    }

}
