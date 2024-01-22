class Problem {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] res = new int[2];

        for(int i=0; i<n; i++){
            if(nums[ Math.abs(nums[i]) - 1 ] < 0){
                res[0] = Math.abs(nums[i]);
            }else{
                nums[ Math.abs(nums[i]) - 1] *= -1;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                res[1] = i + 1;
            }
        }

        return res;
    }
}