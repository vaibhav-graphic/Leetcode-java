class Problem {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flip = 0;
        int flipCount = 0;

        for(int i=0; i<n; i++){
            if(i >= k && nums[i-k] == 2){
                flipCount--;
            }

            if(flipCount % 2 == nums[i]){
                
                if(i + k > n){
                    return -1;
                }

                flip++;
                flipCount++;
                nums[i] = 2;
            }
        }
        return flip;
    }
}