import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class q12_Find_repeating_elemnt {

    // Approach-1 -- By two pointer
    public static void FindRepeatingElement1(int arr[], int n) {
        int count = 0;
        int temp[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    temp[count++] = arr[i];
                }
            }
        }
        System.out.println("Repeating elements are: ");
        for (int i = 0; i < n; i++) {
            if (temp[i] != temp[i + 1]) {
                System.out.println(temp[i] + " ");
            }
        }
    }

    // Approach-2 -Sorting
    public static void FindRepeatingElement2(int arr[], int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i] + " ");
            }
        }

    }

    // Approach-3 _ HashMap
    public static void FindRepeatingElement3(int arr[], int n) {
        HashMap<Integer, Integer> elementCount = new HashMap<>();

        for (int i : arr) {
            if (elementCount.get(i) == null) {
                elementCount.put(i, 1);
            } else {
                elementCount.put(i, elementCount.get(i) + 1);
            }
        }

        System.out.println("the repeating element are");

        for (Entry<Integer, Integer> entry : elementCount.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " ");

            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 5, 2 };
        int n = 8;

        // Approach-1 -- By two pointer
        // FindRepeatingElement1(arr, n);
        // Approach-2 -Sorting
        // FindRepeatingElement2(arr, n);

        // Approach-3 _ HashMap
        FindRepeatingElement3(arr, n);

    }
}
