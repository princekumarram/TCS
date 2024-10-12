import java.util.HashMap;

public class q14_Find_Symmetric_Pairs {

    // BY TWO POINTER APPROACH
    /*
     * public static void main(String args[]) {
     * int n = 5;
     * int arr[][] = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };
     * 
     * for (int i = 0; i < n - 1; i++) {
     * for (int j = i + 1; j < n; j++) {
     * if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
     * System.out.println(" " + arr[i][1] + " " + arr[i][0]);
     * break;
     * }
     * }
     * }
     * }
     */

    // BY USING HASHMAP

    public static void main(String args[]) {
        int n = 5;
        int arr[][] = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            if (mp.get(second) != null && mp.get(second) == first) {
                System.out.println(" " + first + "" + second);
            } else {
                mp.put(first, second);
            }
        }
    }
}
