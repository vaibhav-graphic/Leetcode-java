class Problem {

    int[] memo;
    int n;

    private int getNextIndex(int[][] array, int l, int target) {

        int r = n - 1;
        int res = n + 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (array[mid][0] >= target) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }

    private int solve(int[][] array, int i) {
        if (i >= n) {
            return 0;
        }

        if (memo[i] != -1) {
            return memo[i];
        }

        int next = getNextIndex(array, i + 1, array[i][1]);

        int take = array[i][2] + solve(array, next);
        int notTake = solve(array, i + 1);

        return memo[i] = Math.max(take, notTake);
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        n = startTime.length;

        memo = new int[n];

        Arrays.fill(memo, -1);

        int[][] array = new int[n][3];

        for (int i = 0; i < n; i++) {
            array[i][0] = startTime[i];
            array[i][1] = endTime[i];
            array[i][2] = profit[i];
        }

        Arrays.sort(array, Comparator.comparingInt(vec -> vec[0]));

        return solve(array, 0);
    }
}