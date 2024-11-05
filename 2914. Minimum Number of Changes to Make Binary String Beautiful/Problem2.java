class Problem2 {
    public int minChanges(String s) {
        int n = s.length();
        int count = 0;
        int l = 0;
        int one = 0;
        int zero = 0;

        for (int r = 0; r < n; r++) {
            if (s.charAt(r) == '1')
                one++;
            else
                zero++;

            if ((r - l + 1) % 2 == 0 && one > 0 && zero > 0 && (one + zero) % 2 == 0) {
                count += Math.min(one, zero);
                one = 0;
                zero = 0;

                if (r + 1 < n) {
                    l = r + 1;
                } else {
                    break;
                }
            } else if ((r - l + 1) % 2 == 0 && one >= 0 && zero >= 0 && (one + zero) % 2 == 0) {
                one = 0;
                zero = 0;

                if (r + 1 < n) {
                    l = r + 1;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}