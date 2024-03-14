class Problem {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return solve(nums,goal) - solve(nums,goal-1);
    }

    private int solve(int[] nums, int goal){
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int ans = 0;

        for(int r=0; r<n; r++){
            sum += nums[r];

            while(sum > goal && l <= r){
                sum -= nums[l];
                l++;
            }

            ans += r - l + 1;
        }

        return ans;
    }
}