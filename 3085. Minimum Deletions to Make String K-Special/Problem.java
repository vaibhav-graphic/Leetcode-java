class Problem {
    public int minimumDeletions(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()){
            freq[ ch - 'a' ]++;
        }
        
        Arrays.sort(freq);

        int count = Integer.MAX_VALUE;
        
        for(int i=freq.length-1; i>=0; i--){
            int tar = freq[i];
            int del = 0;

            for(int val : freq){
                if(val > tar + k){
                    del += val - (tar + k);
                }
                else if(val < tar){
                    del += val;
                }
            }

            count = Math.min(count,del);
            if(count == 0) break;
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }
}