class Problem {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        List<String> res = new ArrayList<>();

        Arrays.fill(freq,101);

        for(int i=0; i<words.length; i++){
            int[] temp = new int[26];

            for(char ch : words[i].toCharArray()){
                temp[ch - 'a']++;
            }

            for(int j=0; j<26; j++){
                freq[j] = Math.min(freq[j],temp[j]);
            }
        }

        for(int i=0; i<26; i++){
            while(freq[i] > 0){
                char ch = (char)(i + 'a');

                res.add(Character.toString(ch));
                freq[i]--;
            }
        }

        return res;
    }
}