class ReverseInteger{

    public static int reverse(int x) {
        long ans=0;
    
        while(x!=0){
            int last=x%10;
            ans+=last;
            ans*=10;
            x/=10;
        } 
    
        ans/=10;
    
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
    
        if(x<0)
            return (int) (-1*ans);   
    
        return (int) ans;
        }
    public static void main(String [] args){
        int x=-123;

        System.out.println(reverse(x));
    }
}