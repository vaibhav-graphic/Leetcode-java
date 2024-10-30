class Problem {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] Lis = new int[n];
        int[] Lds = new int[n];

        Arrays.fill(Lis, 1);
        Arrays.fill(Lds, 1);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    Lis[i] = Math.max(Lis[i], Lis[j] + 1);
                }
            }
        }

        for(int i = n - 1; i >= 0; i--){
            for(int j = n - 1; j > i; j--){
                if(nums[i] > nums[j]){
                    Lds[i] = Math.max(Lds[i], Lds[j] + 1); 
                }
            }
        }

        int res = 0;

        for(int i=1; i < n - 1; i++){
            if(Lis[i] > 1 && Lds[i] > 1){
                res = Math.max(res, Lis[i] + Lds[i] - 1);
            }
        }

        return n - res;

    }
}