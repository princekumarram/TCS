import java.util.*;

public class q21_Check_if_array_is_subset_of_another_array {

    public static boolean findSubSetArray1(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        for (int i = 0; i < n1; i++) {
            boolean found = false;
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j])
                    found = true;
            }
            if (!found)
                return false;

        }
        return true;
    }

    public static boolean findSubSetArray2(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        if (m > n)
            return false;
        HashMap<Integer, Boolean> mp = new HashMap<Integer, Boolean>();
        for (int i = 0; i < n; i++) {
            mp.put(arr2[i], true);
        }
        for (int j = 0; j < m; j++) {
            if (mp.containsKey(arr1[j]) == false) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5, 2, };
        int arr2[] = { 2, 4, 3, 1, 7, 5, 15 };

        boolean ans = findSubSetArray2(arr1, arr2);
        System.out.println(ans);
    }

}
