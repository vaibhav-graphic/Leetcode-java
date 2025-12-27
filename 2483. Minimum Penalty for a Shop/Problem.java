class Problem {
    public int bestClosingTime(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];

        for (char c : s.toCharArray())
            if (c == 'Y') dp[0]++;

        int bestPen = dp[0];
        int bestHour = 0;

        for (int j = 1; j <= n; j++) {
            dp[j] = dp[j - 1];
            if (s.charAt(j - 1) == 'N') dp[j]++;
            else dp[j]--;

            if (dp[j] < bestPen) {
                bestPen = dp[j];
                bestHour = j;
            }
        }
        return bestHour;
    }
}
