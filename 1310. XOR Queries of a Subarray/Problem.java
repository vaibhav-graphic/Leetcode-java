class Problem {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int size = queries.length;

        int[] ans = new int[size];
        int[] prefix = new int[n];
        int xor = 0;

        for(int i=0; i<n; i++){
            xor ^= arr[i];
            prefix[i] = xor; 
        }

        int index = 0;

        for(int[] querie : queries ){
            int start = querie[0];
            int end = querie[1];

            if(start == 0){
                ans[index] = prefix[end];
            }else{
                ans[index] = prefix[start - 1] ^ prefix[end];
            }
            index++;
        }

        return ans;
    }
}