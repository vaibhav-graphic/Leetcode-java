class Problem {
    int[] dp = new int[101];

    private int solve(int[] nums,int n,int i){
        if(i >= n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int take = nums[i] + solve(nums,n,i+2);
        int notTake = solve(nums,n,i+1);

        return dp[i] = Math.max(take,notTake);
    }

    public int rob(int[] nums) {
        
        int n = nums.length;
        Arrays.fill(dp,-1);
        return solve(nums,n,0);
    }
}