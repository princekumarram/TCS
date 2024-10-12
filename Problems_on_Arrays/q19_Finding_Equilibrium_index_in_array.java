//equilibrium index means-- in a array , in one index of array where the sum of the left index value and sum of right index value is equal

public class q19_Finding_Equilibrium_index_in_array {

    // method 1

    public static int findEquilibriumIdx1(int num[], int n) {
        int leftSum, rightSum;

        for (int i = 0; i < n; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + num[j];
            }

            rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum = rightSum + num[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    // method -2
    public static int findEquilibriumIdx2(int num[], int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum = totalSum + num[i];

        }
        int leftSum = 0, rightSum = totalSum;

        for (int i = 0; i < n; i++) {
            rightSum = rightSum - num[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum = leftSum + num[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int nums[] = { 2, 3, -1, 8, 4 };
        // int equilibriumidx = findEquilibriumIdx1(nums, n);
        int equilibriumidx = findEquilibriumIdx2(nums, n);

        System.out.println(equilibriumidx);

    }

}
