import java.util.Arrays;

public class Approch_2 {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;

        if (k < 0) {
            k += nums.length;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        rotate(arr, k);
        System.out.print(Arrays.toString(arr));
    }
}
