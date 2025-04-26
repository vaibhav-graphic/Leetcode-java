class Problem {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int minPostion = -1;
        int maxPostion = -1;
        int currPostion = -1;
        long ans = 0;

        for(int i=0; i<n; i++){
            if(nums[i] < minK || nums[i] > maxK){
                currPostion = i;
            }

            if(nums[i] == minK){
                minPostion = i;
            }

            if(nums[i] == maxK){
                maxPostion = i;
            }

            int small = Math.min(minPostion,maxPostion);
            long temp = small - currPostion;
            ans += temp <= 0 ? 0 : temp;
        }
        return ans;
    }
}