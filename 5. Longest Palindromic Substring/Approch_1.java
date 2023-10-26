class Approch_1{

    public static String longestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int n=s.length();
        int start=0;
        int max=0;

        for(int i=0;i<n;i++){
            for(int j=0;i+j<n;j++){
                if(isPal(arr,i,j)&&j+1>max){
                    max=j+1;
                    start=i;
                }
            }
        }
        return s.substring(start,start+max);
    }

    private static boolean isPal(char[] arr,int i,int j){
        while(j>0){
            if(arr[i]!=arr[i+j]){
                return false;
            }

            i++;
            j-=2;
        }
        return true;
    }
    public static void main(String [] args){
        String str="babad";

        System.out.println(longestPalindrome(str));
    }
}