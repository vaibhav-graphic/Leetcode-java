class Problem {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        int index = 0;
        
        for(int i=0; i<n-2; i++){
            if(nums[i] == 0){
                index = i;
                for(int j=0; j<3; j++){
                    nums[index] = nums[index] == 1 ? 0 : 1;
                    index++;
                }
                count++;
            }
        }
        
        if(nums[n-1] == 0 || nums[n-2] == 0) return -1;

        return count;
    }
}