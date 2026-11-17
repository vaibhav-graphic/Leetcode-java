class Problem {
    public String digitSum(String s, int k) {
        List<Integer> cur = new ArrayList<>();
        for (char c : s.toCharArray()) cur.add(c - '0');

        while (cur.size() > k) {
            List<Integer> nxt = new ArrayList<>();
            for (int i = 0; i < cur.size(); i += k) {
                int sum = 0;
                for (int j = i; j < cur.size() && j < i + k; j++)
                    sum += cur.get(j);

                int start = nxt.size();
                if (sum == 0) nxt.add(0);
                while (sum > 0) {
                    nxt.add(sum % 10);
                    sum /= 10;
                }
                Collections.reverse(nxt.subList(start, nxt.size()));
            }
            cur = nxt;
        }

        StringBuilder res = new StringBuilder();
        for (int d : cur) res.append(d);
        return res.toString();
    }
}