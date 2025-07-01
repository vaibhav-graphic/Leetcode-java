class Problem {
    public int possibleStringCount(String word) {
        int[] freq = new int[26];
        int n = word.length();
        char prev = '*';
        int count = 1;
        
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);

            if(freq[ch - 'a'] > 0){
                count++;
            }

            freq[ch - 'a']++;

            if(prev != '*' && prev != ch){
                // System.out.println(prev);
                freq[prev - 'a'] = 0;
            }

            prev = ch;
        }

        return count;
    }
}