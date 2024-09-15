class Problem {
    public int findTheLongestSubstring(String s) {
        HashMap<String, Integer> hm = new HashMap<>();

        int[] countVowels = new int[5];
        int n = s.length();
        int res = 0;

        String currString = "00000";
        
        hm.put(currString, -1);

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(ch == 'a'){
                countVowels[0] = (countVowels[0] + 1) % 2;
            }
            else if(ch == 'e'){
                countVowels[1] = (countVowels[1] + 1) % 2;
            }
            else if(ch == 'i'){
                countVowels[2] = (countVowels[2] + 1) % 2;
            }
            else if(ch == 'o'){
                countVowels[3] = (countVowels[3] + 1) % 2;
            }
            else if(ch == 'u'){
                countVowels[4] = (countVowels[4] + 1) % 2;
            }

            currString = "";
            
            for(int j=0; j<5; j++){
                currString += countVowels[j];
            }

            if(hm.containsKey( currString ) == true){
                res = Math.max(res, i - hm.get( currString ));
            }else{
                hm.put(currString, i);
            }
        }

        return res;
    }
}