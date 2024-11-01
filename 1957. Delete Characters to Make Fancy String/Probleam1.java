class Problem {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        char prev = '*';
        int[] freq = new int[26];

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;

            if(freq[ch - 'a'] < 3){
                sb.append(ch);
            }

            if(prev != ch){
                if(prev == '*'){
                    prev = ch;
                    continue;
                }
                freq[prev - 'a'] = 0;
                prev = ch;
            }
        }

        return sb.toString();
    }
}