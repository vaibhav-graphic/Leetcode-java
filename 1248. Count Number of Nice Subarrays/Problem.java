class Problem {
    public int numberOfSubarrays(int[] nums, int k) {
        return solve(nums, k) - solve(nums, k - 1);
    }

    private int solve(int[] nums, int k) {
        if(k < 0){
            return 0;
        }
        int n = nums.length;
        int l = 0;
        int count = 0;
        int res = 0;

        for (int r = 0; r < n; r++) {
            if (nums[r] % 2 != 0) {
                count++;
            }

            while (count > k) {
                if (nums[l] % 2 != 0) {
                    count--;
                }
                l++;
            }
           res += (r-l+1);
        }
        return res;
    }
}