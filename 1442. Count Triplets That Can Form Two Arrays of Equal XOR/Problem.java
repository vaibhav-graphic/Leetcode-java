class Problem {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n+1];
        int count = 0;

        int data = 0;
        for(int i=0; i<n; i++){
            data ^= arr[i];
            pre[i+1] = data; 
        }

        for(int i=0; i<pre.length; i++){
            for(int k=i+1; k<pre.length; k++){
                if(pre[i] == pre[k]){
                    count += k - i - 1;
                }
            }
        }

        return count;
    }
}