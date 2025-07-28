class Problem {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOr = 0;

        for(int num : nums){
            maxOr |= num;
        }

        int[][] dp = new int[n][maxOr + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(nums, n - 1, 0, maxOr, dp);
    }

    private int solve(int[] nums, int index, int currOr, int maxOr, int[][] dp){
        if(index < 0){
            if(currOr == maxOr){
                return 1;
            }
            return 0;
        }

        if(dp[index][currOr] != -1){
            return dp[index][currOr];
        }
        
        int notTake = solve(nums, index - 1, currOr, maxOr, dp);
        int take = solve(nums, index - 1, currOr | nums[index], maxOr, dp);
        return dp[index][currOr] = take + notTake;
    }
}