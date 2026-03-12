class Problem {
    public int bitwiseComplement(int n) {
        if(n==0) return 1; 
        int count=0, t=n;

        while(t>0){
            t>>=1;
            count++;
        }
        
        int mask=(1<<count)-1;

        return n^mask;
    }
}