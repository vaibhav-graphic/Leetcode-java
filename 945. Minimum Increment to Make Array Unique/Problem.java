class Problem {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;

        for(int i=1; i<n; i++){
            if(nums[i] <= nums[i-1]){
                count += (nums[i-1] - nums[i]) + 1;
                nums[i] = nums[i-1] + 1; 
            }
        }

        return count;
    }
}