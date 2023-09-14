import java.util.*;

class Running_Sum_of_1d_Array {

    private static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1 };

        System.out.print(Arrays.toString(runningSum(arr)));
    }
}