class Problem1 {
    public int largestCombination(int[] nums) {
        int n = nums.length;
        int[] bits = new int[32];
        int res = 0;

        for(int bitpos = 0; bitpos < 32; bitpos++){
            for(int num : nums){
                if((num & (1 << bitpos)) > 0){
                    bits[bitpos]++;
                }
            }

            res = Math.max(res, bits[bitpos]);
        }

        return res;
    }
}