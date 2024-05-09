class Problem {
    public long maximumHappinessSum(int[] arr, int k) {
        int n = arr.length;
        long res = 0;
        int count = 0;
        Arrays.sort(arr);

        for(int i=n-1; i>=0; i--){
            if(k > 0){
                int cal = arr[i] - count;

                if(cal > 0){
                    res += cal;
                    count++;
                }else{
                    break;
                }
            }else{
                break;
            }
            k--;
        }
        return res;
    }
}