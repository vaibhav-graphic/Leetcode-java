class Problem {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];

        for(int val : arr){
            int rem = (val % k + k) % k; // -ve test case
            freq[rem]++;
        }


        if(freq[0] % 2 != 0){
            return false;
        }

        for(int rem = 1; rem <= k/2; rem++){
            int remain = k - rem;

            if(freq[remain] != freq[rem]){
                return false;
            }
        }

        return true;
    }
}