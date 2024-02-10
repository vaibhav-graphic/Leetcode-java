class Problem {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        boolean[][] dp = new boolean[n][n];

        for(int len=1; len<=n; len++){
            for(int i=0; i+len<=n; i++){

                int j = i+len-1;
                if(i == j){
                    dp[i][j] = true;
                }
                else if(i+1 == j){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }
                }else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
                }

                if(dp[i][j] == true){
                    count++;
                }
            }
        }
        return count;
    }
}