class Problem {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int count = 0;
        boolean odd = false;

        for(char ch : s.toCharArray()){
            freq[ch]++;
        }


        for(int i=0; i<128; i++){
            if(freq[i] % 2 == 0){
                count += freq[i];
            }
            else if(freq[i] % 2 == 1){
                count += freq[i] -1;
                odd = true;
            }
        }

        if(odd == true){
            count++;
        }

        return count;
    }
}