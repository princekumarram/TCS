import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class q13_find_non_repeating_ele {

    // Aproach 1- two pointer
    public static void findNonRepeatingElement1(int arr[], int n) {
        int count = 0;
        int newArr[] = new int[n];

        for (int i = 0; i < n - 1; i++) {
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                newArr[count++] = arr[i];
            }
        }
        System.out.println("Non Repeating Element is: ");
        for (int i = 0; i < count; i++) {

            System.out.println(newArr[i] + " ");

        }
    }

    // Aproach 2- By sort
    public static void findNonRepeatingElement2(int arr[], int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i - 1] != arr[i]) && (i == n - 1 || arr[i] != arr[i + 1])) {
                System.out.println(arr[i] + " ");
            }
        }

    }

    // Approach-3 Hashmap
    public static void findNonRepeatingElement3(int arr[], int n) {
        HashMap<Integer, Integer> findElement = new HashMap<>();

        for (int i : arr) {
            if (findElement.get(i) == null) {
                findElement.put(i, 1);
            } else {
                findElement.put(i, findElement.get(i) + 1);
            }
        }

        for (Entry<Integer, Integer> entry : findElement.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 1, 3, 1 };
        int n = 6;

        // Aproach 1- two pointer
        // findNonRepeatingElement1(arr,n);

        // Appraoch-2 By sorting
        // findNonRepeatingElement2(arr, n);
        findNonRepeatingElement3(arr, n);
    }

}
