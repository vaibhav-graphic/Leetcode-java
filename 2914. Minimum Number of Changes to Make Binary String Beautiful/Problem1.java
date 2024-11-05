class Problem1 {
    public int minChanges(String s) {
        int n = s.length();
        int count = 0;
        int one = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                zero++;
            }

            if ((i + 1) % 2 == 0) { 
                count += Math.min(one, zero);
                one = 0;
                zero = 0;
            }
        }

        return count;
    }
}
