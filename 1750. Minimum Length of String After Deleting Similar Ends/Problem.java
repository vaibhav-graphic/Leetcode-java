class Problem {
    public int minimumLength(String s) {
        int n = s.length();

        if (n == 1) {
            return 1;
        }

        int i = 0;
        int j = n - 1;

        while(i < j && s.charAt(i) == s.charAt(j)){
            char ch = s.charAt(i);

            while(i < j && ch == s.charAt(i)){
                i++;
            }
            while(j >= i && ch == s.charAt(j)){
                j--;
            }
        }
        return j - i + 1;
    }
}