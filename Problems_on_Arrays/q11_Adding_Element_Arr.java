public class q11_Adding_Element_Arr {

    public static int[] insertAtBeginning(int arr[], int n, int value) {

        int temp[] = new int[n + 1];
        temp[0] = value;

        for (int i = 0; i < n; i++) {
            temp[i + 1] = arr[i];
        }

        return temp;

    }

    public static int[] insertAtPosition(int arr[], int n, int value, int positon) {
        int temp[] = new int[n + 1];

        for (int i = 0; i < positon - 1; i++) {
            temp[i] = arr[i];
        }
        temp[positon - 1] = value;

        for (int i = positon; i < n + 1; i++) {
            temp[i] = arr[i - 1];
        }
        return temp;
    }

    public static int[] insertAtEnding(int arr[], int n, int val) {

        int temp[] = new int[n + 1];
        for (int i = 0; i < n; i++) {

            temp[i] = arr[i];
        }
        temp[n] = val;

        return temp;
    }

    public static void main(String[] args) {
        int n = 8;
        int arr[] = { 10, 9, 14, 8, 20, 48, 16, 9 };
        int value = 40;
        int positon = 4;

        int newArr1[] = insertAtBeginning(arr, n, value);
        int newArr2[] = insertAtPosition(arr, n, value, positon);
        int newArr3[] = insertAtEnding(arr, n, value);

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew array after inserting the element at the beginning:");
        for (int i = 0; i < newArr1.length; i++) {
            System.out.print(newArr1[i] + " ");
        }

        System.out.println("\nNew array after inserting the element at the positon:");
        for (int i = 0; i < newArr2.length; i++) {
            System.out.print(newArr2[i] + " ");
        }

        System.out.println("\nNew array after inserting the element at the Ending:");
        for (int i = 0; i < newArr3.length; i++) {
            System.out.print(newArr3[i] + " ");
        }
    }
}