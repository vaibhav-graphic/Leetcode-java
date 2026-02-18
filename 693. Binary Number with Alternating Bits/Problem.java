class Problem {
    public boolean hasAlternatingBits(int n) {
        int a=0, b=0;
        
        while(n>0){
            a=n&1;

            n>>=1;

            b=n&1;

            if(a==b) return false;
        }
        return true;
    }
}