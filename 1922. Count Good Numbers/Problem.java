class P {
    public int countGoodNumbers(long n) {
      long eIndex=(n+1)/2;
      long oIndex=n/2;

      long e=pow(5,eIndex)%1_000_000_007;
      long o=pow(4,oIndex)%1_000_000_007;
      return (int)((e*o)%1_000_000_007);  
    }

    private long pow(long x,long n){
        if(n==0) return 1;
        long temp=pow(x,n/2);

        if(n%2==0) return (temp*temp)%1_000_000_007;
        else return x*temp*temp%1_000_000_007;
    }
}