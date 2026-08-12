class Problem {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        int l = 0;
        int max = 0;

        for(int r=0; r<n; r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);

            while(hm.get(nums[r]) > k && l < r){
                hm.put(nums[l] , hm.getOrDefault(nums[l],0) -1 );
                l++;
            }

            max = Math.max(max,r - l + 1);
        }
        return max;
    }
}