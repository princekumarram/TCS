import java.io.*;
import java.util.Arrays;

public class q1_small_No_In_Array {

    // MEHTOD-1
    // static int sort(int arr[]) {
    // Arrays.sort(arr);
    // return arr[0];
    // }

    // METHOD-2
    static int sort(int arr[]) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int arr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("The smallest in array is:" + sort(arr1));

        int arr2[] = { 8, 10, 5, 7, 9 };
        System.out.println("The smallest element in array is" + sort(arr2));

    }

}