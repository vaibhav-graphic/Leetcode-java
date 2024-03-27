class Problem {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;

        int l=0;
        int max = 0;
        int sum = 1;
        int ans = 0;
        int n = nums.length;

        for(int r=0; r<n; r++){
            sum *= nums[r];

            while(sum >= k && l<r){
                sum /= nums[l];
                l++;
            }
            if(sum < k){
                ans += (r-l+1);                
            }
        }
        return ans;
    }
}