class Problem1 {
    public boolean isCircularSentence(String s) {
        int n = s.length();

        if(s.charAt(0) != s.charAt(n - 1)){
            return false;
        }

        for(int i=0; i<n; i++){
            while(i < n && s.charAt(i) != ' '){
                i++;
            }

            if( i < n && s.charAt(i - 1) != s.charAt(i + 1)){
                return false;
            }
        }

        return true;
    }
}