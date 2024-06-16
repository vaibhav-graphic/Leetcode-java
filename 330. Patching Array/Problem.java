class Problem {
    public int minPatches(int[] nums, int n) {
        int add = 0;
        long maxReach = 0;
        int i = 0;

        while(maxReach < n){
            if(i < nums.length && nums[i] <= maxReach + 1){
                maxReach += nums[i];
                i++;
            }else{
                maxReach += (maxReach + 1);
                add++;
            }
        }
        return add;
    }
}