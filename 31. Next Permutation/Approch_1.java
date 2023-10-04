import java.util.Arrays;

class Approch_1 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        int index2 = -1;

        // Find the first index where nums[i] > nums[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            // If there's no such index, reverse the whole array
            reverse(nums, 0, n - 1);
        } else {
            // Find the smallest number in the right subarray that is greater than nums[index]
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    index2 = i;
                    break;
                }
            }

            // Swap nums[index] and nums[index2]
            swap(nums, index, index2);

            // Reverse the right subarray to make it in ascending order
            reverse(nums, index + 1, n - 1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Approch_1 solution = new Approch_1();

        int[] nums = {1, 2, 3};
        solution.nextPermutation(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));

        int[] nums2 = {3, 2, 1};
        solution.nextPermutation(nums2);
        System.out.println("Next Permutation: " + Arrays.toString(nums2));
    }
}
