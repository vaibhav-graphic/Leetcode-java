class Problem {
    int[] arr = new int[10001];
    public int numSquares(int n) {
        Arrays.fill(arr,-1);
        return help(n);
    }

    private int help(int n){
        if(n == 0){
            return 0;
        }

        if(arr[n] != -1){
            return arr[n];
        } 

        int min = Integer.MAX_VALUE;

        for(int i=1; i*i <=n; i++){
            int result = 1 + help(n - i*i);
            min = Math.min(min,result);
        }

        return arr[n] = min;
    }
}