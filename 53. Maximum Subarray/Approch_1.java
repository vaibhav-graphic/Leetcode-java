class Approch_1 {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
                int currentSum = 0;
            for (int j = i; j < n; j++) {
                    currentSum += nums[j];
                    maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};

        System.out.print(maxSubArray(arr));
    }
}
