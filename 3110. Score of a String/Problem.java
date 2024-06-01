class Problem {
    public int scoreOfString(String s) {
        int n = s.length();
        int sum = 0;

        for(int i=1; i<n; i++){
            char ch1 = s.charAt(i-1);
            char ch2 = s.charAt(i);

            sum += (int)Math.abs(ch1 - ch2);
        }

        return sum;
    }
}