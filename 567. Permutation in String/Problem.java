class Problem {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if(m > n){
            return false;
        }

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(char ch : s1.toCharArray()){
            s1freq[ch - 'a']++;
        }

        int l = 0;

        for(int r=0; r<n; r++){
            char ch = s2.charAt(r);
            s2freq[ch - 'a']++;

            if(r - l + 1 > m){
                char ch2 = s2.charAt(l);
                s2freq[ch2 - 'a']--;
                l++;
            }

            if(r - l + 1 == m && check(s1freq, s2freq, s1)){
                return true;
            } 
        }
        return false;
    }

    private boolean check(int[] arr1, int[] arr2, String s){
        int n = s.length();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(arr1[ch - 'a'] != arr2[ch - 'a']){
                return false;
            }
        }

        return true;
    }
}