class Problem {
    int n;
    int m;
    int[][] dp = new int[1001][1001];
    private int solve(String s1,String s2,int i,int j){
        if(i >= n || j >= m){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1 + solve(s1,s2,i+1,j+1);
        }

        int a = dp[i][j] = solve(s1,s2,i,j+1);
        int b = dp[i][j] = solve(s1,s2,i+1,j);

        return  dp[i][j] = Math.max(a,b);
    }

    public int longestCommonSubsequence(String s1, String s2) {
        n =  s1.length();
        m = s2.length();

        for(int[] val : dp){
            Arrays.fill(val,-1);
        }

        return solve(s1,s2,0,0);
    }
}