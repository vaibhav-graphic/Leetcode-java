class Problem {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(prefix(words[i],words[j]) && suffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    private boolean prefix(String s1, String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        
        for(int i=0 ;i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
    private boolean suffix(String s1, String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        
        int i = s1.length()-1;
        int j = s2.length()-1;
        
        while(i >= 0){
            if(s1.charAt(i) != s2.charAt(j)){
                return false;
            }
               i--;
               j--;
        }
        return true;
    }
}