class Problem {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);

        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int count = 0;

        while(i <= j){
            if(arr[i] + arr[j] <= limit){
                i++;
                j--;
            }else{
                j--;
            }
            count++;
        }
        return count;
    }
}