class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int[] freq = {-1,-1,-1};

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            freq[ ch - 'a'] = i;

            if(freq[0] != -1 && freq[1] != -1 && freq[2] != -1){
                int mina = Math.min(freq[0] , Math.min(freq[1] , freq[2]));
                count += 1 + mina;
            }
        }
        return count;
    }
}