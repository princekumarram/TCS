import java.util.Arrays;

public class q9_Median_of_Array {
    public static void getMedian(int arr[], int n) {
        Arrays.sort(arr);

    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 2, 5, 6 };
        int n = 6;
        System.out.print("The median of the array is: ");
        getMedian(arr, n);
    }

}
