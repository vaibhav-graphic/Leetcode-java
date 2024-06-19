class Problem {
    public int minDays(int[] nums, int m, int k) {
        int n = nums.length;
        int maxDays = 0;

        for(int val : nums){
            maxDays = Math.max(maxDays,val);
        }

        System.out.println(maxDays);

        int l = 0;
        int h = maxDays;
        int res = Integer.MAX_VALUE;

        while(l <= h){
            int mid = l + (h - l) / 2;

            if(help(nums,m,k,mid)){
                res = Math.min(res,mid);
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private boolean help(int[] arr,int m,int k,int day){
        int total = 0;
        int bouq = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] <= day){
                total++;
            }else{
                total = 0;
            }

            if(total == k){
                bouq++;
                total = 0;
            }
        }
        return bouq >= m;
    }
}