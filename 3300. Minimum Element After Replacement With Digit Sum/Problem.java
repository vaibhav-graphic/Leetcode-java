class Problem {
    public int minElement(int[] nums) {
        int n = nums.length;

        int minEle = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int run = nums[i];
            int sum = 0;

            while(run > 0){
                sum += run % 10;
                run = run / 10;
            }

            minEle = Math.min(minEle, sum);
        }

        return minEle;
    }
}