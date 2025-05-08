class Solution {
    public int minTimeToReach(int[][] t) {
        int n = t.length, m = t[0].length;
        int[][][] dp = new int[n][m][2];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                Arrays.fill(dp[i][j], Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        dp[0][0][0] = 0;
        pq.offer(new int[]{0, 0, 0, 0});

        int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0], x = curr[1], y = curr[2], parity = curr[3];

            if (dp[x][y][parity] < time) continue;

            for (int[] d : dir) {
                int nx = x + d[0], ny = y + d[1];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                int waitTime = Math.max(time, t[nx][ny]);
                int nextParity = 1 - parity;
                int nextTime = waitTime + 1 + parity;

                if (nx == n - 1 && ny == m - 1)
                    return nextTime;

                if (nextTime < dp[nx][ny][nextParity]) {
                    dp[nx][ny][nextParity] = nextTime;
                    pq.offer(new int[]{nextTime, nx, ny, nextParity});
                }
            }
        }

        return -1;
    }
}