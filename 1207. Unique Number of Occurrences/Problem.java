class Problem {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        int[] freq = new int[2001];

        for(int i=0; i<n; i++){
            freq[ 1000 + arr[i] ]++;
        }

        Arrays.sort(freq);

        for(int i=1; i<2001; i++){
            if(freq[i] != 0 && freq[i] == freq[i-1]){
                return false;
            }
        }

        return true;
    }
}