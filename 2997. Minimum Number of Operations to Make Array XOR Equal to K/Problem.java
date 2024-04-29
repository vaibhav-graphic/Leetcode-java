class Problem {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int xor = 0;

        for(int num : nums){
            xor ^= num;
        }

        int count = 0;

        while(xor > 0 || k > 0){
            if((xor & 1) != (k & 1)){
                count++;
            }
            xor >>= 1;
            k >>= 1;
        }
        return count;
    }
}