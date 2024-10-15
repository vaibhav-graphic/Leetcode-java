class Problem {
    public long minimumSteps(String s) {
        int n = s.length();
        long count = 0;
        long one = 0;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(ch == '1'){
                one++;
            }else{
                count += one;
            }
        }
        return count;
    }
}