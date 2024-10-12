
public class q15_Max_Product_Subarray {

    public static int Print1(int arr[], int n) {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int prod = 1;

                for (int k = i; k <= j; k++) {
                    prod = prod * arr[k];
                    result = Math.max(prod, result);
                }
            }
        }
        return result;

    }

    public static int Print2(int arr[], int n) {

        int result = arr[0];

        for (int i = 0; i < n - 1; i++) {
            int p = arr[i];
            for (int j = i + 1; j < n; j++) {
                result = Math.max(p, result);
                p = p * arr[j];
            }
            result = Math.max(p, result);
        }
        return result;

    }

    public static int Print3(int arr[], int n) {

        int pref = 1, suf = 1;
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pref == 0)
                pref = 1;
            if (suf == 0)
                suf = 1;

            pref = pref * arr[i];
            suf = suf * arr[n - i - 1];

            res = Math.max(res, Math.max(pref, suf));
        }
        return res;
    }

    public static int Print4(int arr[], int n) {

        int prod1 = arr[0], prod2 = arr[0], result = arr[0];

        for (int i = 0; i < n; i++) {
            int temp = Math.max(arr[i], Math.max(prod1 * arr[i], prod2 * arr[i]));

            prod2 = Math.min(arr[i], Math.min(prod1 * arr[i], prod2 * arr[i]));
            prod1 = temp;

            result = Math.max(result, prod1);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0 };
        int n = 6;

        // int ans = Print1(arr, n);
        // int ans = Print2(arr, n);
        // int ans = Print3(arr, n);
        int ans = Print4(arr, n);

        System.out.println("THe answer is--> " + ans);

    }
}