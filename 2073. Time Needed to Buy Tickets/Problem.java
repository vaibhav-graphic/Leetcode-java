class Problem {
    public int timeRequiredToBuy(int[] arr, int k) {
        int n = arr.length;

        int time = 0;

        for(int i=0; i<n; i++){
            if(i <= k){
                time += Math.min(arr[i] , arr[k]);
            }else{
                time += Math.min(arr[i] , arr[k] - 1);
            }
        }
        return time;
    }
}