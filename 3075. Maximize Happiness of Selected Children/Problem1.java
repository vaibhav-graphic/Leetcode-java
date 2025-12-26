class Problem1 {
    public long maximumHappinessSum(int[] arr, int k) {
        int n = arr.length;
        long res = 0;
        int count = 0;
        Arrays.sort(arr);

        for(int i=n-1; i>=(n - k); i--){
            int val = arr[i] - count++;

            if(val > 0){
                res += val;
            }
        }
        return res;
    }
}