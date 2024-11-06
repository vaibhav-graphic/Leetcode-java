class Problem {
    public boolean canSortArray(int[] nums) {
        int setBit = Integer.bitCount(nums[0]);
        int maxS = nums[0];
        int minS = nums[0];
        int maxOPS = Integer.MIN_VALUE;

        for(int i=1; i<nums.length; i++){
            if(setBit == Integer.bitCount(nums[i])){
                maxS = Math.max(maxS, nums[i]);
                minS = Math.min(minS, nums[i]);
            }else{
                if(minS < maxOPS){
                    return false;
                }

                maxOPS = maxS;
                maxS = nums[i];
                minS = nums[i];
                setBit = Integer.bitCount(nums[i]);
            }
        }

        if(minS < maxOPS){
            return false; 
        }

        return true;
    }
}