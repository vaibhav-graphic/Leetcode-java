class Problem {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long res = 0;
        long side = 0;

        for(int i=0; i<n; i++){
            if(nums[i] < side){
                res = side + nums[i];
            }

            side += nums[i];
        }

        return res == 0 ? -1 : res;
    }
}