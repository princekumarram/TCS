import java.util.Arrays;

public class q8_Average_of_Array {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 3, 4, 5 };
        int avg = 0;

        for (int i = 0; i < n; i++) {
            avg += arr[i];
        }
        avg = avg / n;

        System.out.println("the average is " + avg);
    }

}
