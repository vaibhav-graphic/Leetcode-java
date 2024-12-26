class Problem {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        return solve(nums, n - 1, 0, target);
    }

    private int solve(int[] arr, int index, int sum, int target){
        if(index < 0){
            if(sum == target){
                return 1;
            }
            return 0;
        }

        int pos = solve(arr, index - 1, sum + arr[index], target);
        int mins = solve(arr, index - 1, sum - arr[index], target);

        return pos + mins;
    }
}