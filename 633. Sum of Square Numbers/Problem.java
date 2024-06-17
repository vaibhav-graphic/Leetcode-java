class Problem {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long)Math.sqrt(c);

        while(a <= b){
            long res = (a * a) + (b * b);

            if(res == c){
                return true;
            }
            else if(res < c){
                a++;
            }else{
                b--;
            }
        }
        return false;
    }
}