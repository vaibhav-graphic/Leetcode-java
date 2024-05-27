class Problem {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[1001];

        for(int i=0; i<n; i++){
            temp[ nums[i] ]++;
        }

        int total = n;

        for(int i=0; i<1001; i++){
            if(i == total){
                return i;
            }
            total -= temp[i];
        }

        return -1;
    }
}