import java.util.*;
import java.util.Arrays;
import java.util.HashSet;

public class q16_Replace_elements_by_its_rank_in_array {

    // not for duplicate
    public static void ArrayRank1(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == temp[j]) {
                    System.out.print(j + 1 + " ");
                    break;
                }
            }
        }

    }

    // By using hashset
    public static void ArrayRank2(int arr[], int n) {

        for (int i = 0; i < n; i++) {

            Set<Integer> s = new HashSet<Integer>();
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    s.add(arr[j]);
                }
            }
            int rank = s.size() + 1;
            System.out.println(rank + " ");

        }

    }

    // By using HashMap

    public static void ArrayRank3(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int temp = 1;
        int newArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        Arrays.sort(newArr);

        for (int i = 0; i < n; i++) {
            // if previously element is not store in the mp
            if (mp.get(newArr[i]) == null) {
                mp.put(newArr[i], temp);
                temp++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mp.get(arr[i]) + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 20, 15, 26, 2, 98, 6, 15 };
        int n = 7;

        // ArrayRank1(arr, n);
        // ArrayRank2(arr, n);
        ArrayRank3(arr, n);

    }
}
