import java.util.HashMap;
import java.util.Map;

public class q5_CountFrequencyOfArray {

    // public static void countFreq(int arr[], int n) {

    // boolean visited[] = new boolean[n];

    // for (int i = 0; i < n - 1; i++) {
    // if (visited[i] == true)

    // continue;

    // int freq = 1;
    // for (int j = 0; j < n; j++) {
    // if (arr[i] == arr[j]) {
    // visited[j] = true;
    // freq++;
    // }
    // }
    // System.out.println(arr[i] + " " + freq);
    // }

    // }

    public static void countFreq(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String args[]) {

        int arr[] = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;
        countFreq(arr, n);
    }

}
