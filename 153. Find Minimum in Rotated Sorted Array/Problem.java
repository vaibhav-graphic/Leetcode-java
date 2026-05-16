class Problem {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        int l = 0;
        int h = n - 1;

        while(l <= h){
            int m = (l + h) / 2;

            if(nums[l] <= nums[m]){
                min = Math.min(min, nums[l]);
                l = m + 1;
            }else{
                min = Math.min(min, nums[m]);
                h = m - 1;
            }
        }

        return min;
    }
}