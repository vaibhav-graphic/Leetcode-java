class Problem2 {
    public int largestCombination(int[] nums) {
        int n = nums.length;
        int res = 0;

        for(int bitpos = 0; bitpos < 32; bitpos++){
            int count = 0;
            for(int num : nums){
                if((num & (1 << bitpos)) > 0){
                    count++;
                }
            }

            res = Math.max(res, count);
        }

        return res;
    }
}