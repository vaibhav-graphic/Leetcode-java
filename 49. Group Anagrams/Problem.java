class Problem {

    private String generate(String s){
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ ch - 'a' ]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                sb.append(String.valueOf((char) (i + 'a')) .repeat(freq[i]));
            }
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hs = new HashMap<>();

        for(String s : strs){
    
            String word = generate(s);

            if(!hs.containsKey(word)){
                hs.put(word,new ArrayList<>());
            }

            hs.get(word).add(s);
        }

        return new ArrayList<>(hs.values());
    }
}