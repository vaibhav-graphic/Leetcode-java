class Problem {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();

        int l = 0;
        int cost = 0;
        int length = 0;
        int res = 0;

        for (int r = 0; r < n; r++) {
            char ch1 = s.charAt(r);
            char ch2 = t.charAt(r);
            cost += Math.abs(ch1 - ch2);

            while (cost > maxCost && l < r) {

                cost -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
                
            }

            if (cost <= maxCost) {
                length = r - l + 1;
            }

            res = Math.max(res, length);
        }
        return res;
    }
}