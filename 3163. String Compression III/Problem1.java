class Problem1 {
    public String compressedString(String s) {
        int n = s.length();
        int l =  0;
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();

        for(int r = 0; r < n; r++){
            char ch = s.charAt(r);
            freq[ch - 'a']++;

            if(s.charAt(r) != s.charAt(l) || freq[ s.charAt(l) - 'a' ] == 9){
                char chl = s.charAt(l);
                String noOfTime = String.valueOf(freq[chl - 'a']);

                sb.append(noOfTime);
                sb.append(chl);
                freq[chl - 'a'] = 0;

                if(s.charAt(l) == s.charAt(r)){
                    l = r + 1;
                }else{
                    l = r;
                }
            }
        }

        if(l < n){
            char ch = s.charAt(l);
            sb.append(String.valueOf(freq[ch - 'a']));
            sb.append(ch);
        }
        
        return sb.toString();
    }
}