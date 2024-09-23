class Problem {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Set<String> set = new HashSet<>();

        for (String str : dictionary) {
            set.add(str);
        }

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return solve(0, n, s, set, dp);
    }

    private int solve(int index, int n, String s, Set<String> set, int[] dp) {
        if (index >= n) {
            return 0;
        }

        if(dp[index] != -1){
            return dp[index];
        }

        int res = 1 + solve(index + 1, n, s, set, dp);

        for (int j = index; j < n; j++) {
            String curr = s.substring(index, j + 1);

            if (set.contains(curr)) {
                res = Math.min(res, solve(j + 1, n, s, set, dp));
            }
        }

        return dp[index] = res;
    }
}