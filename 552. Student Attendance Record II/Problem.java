class Problem {
    private int M = 1_000_000_007;
    private int[][][] t = new int[100001][2][3];

    public int checkRecord(int n) {
        for (int i = 0; i < 100001; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(t[i][j], -1);
            }
        }

        return solve(n,0,0);
    }

    private int solve(int n,int absent,int late_Con){
        if(absent >= 2 || late_Con >= 3){
            return 0;
        }

        if(n == 0){
            return 1;
        }

        if(t[n][absent][late_Con] != -1){
            return t[n][absent][late_Con];
        }

        int a = solve(n-1,absent+1,0) % M;
        int p = solve(n-1,absent,0) % M;
        int l = solve(n-1,absent,late_Con + 1) % M;

        return t[n][absent][late_Con] = ((a + l) % M + p) % M;
    }
}