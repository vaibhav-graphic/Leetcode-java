class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;

        long maxElement = Arrays.stream(nums).max().getAsInt();

        long l = 0;
        long ans = 0;
        long count = 0;

        for (long r = 0; r < n; r++) {
            if(nums[(int)r] == maxElement){
                count++;
            }

            while(count >= k){
                if(nums[(int)l] == maxElement){
                    count--;
                }
                l++;
                ans += n - r;
            }
        }
        return ans;
    }
}