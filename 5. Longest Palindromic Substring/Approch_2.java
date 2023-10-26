class Approch_2{

    public static String longestPalindrome(String s) {
        int n=s.length();
        
        int start=0,end=0;
        for(int i=0;i<n;i++){
            int len1=expandFromCenter(s,i,i+1);
            int len2=expandFromCenter(s,i,i);
            int maxLen=Math.max(len1,len2);

            // System.out.println(len1+" -len1"+" "+len2+" -len2");

            if(end-start<maxLen){
                start=i-(maxLen-1)/2;
                end=i+maxLen/2;
            }

            // System.out.println(start+" "+end);
        }
        return s.substring(start,end+1);
    }

    private static int expandFromCenter(String s,int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }

        return j-i-1;
    }

    public static void main(String [] args){
        String str="acvghgvpbab";

        System.out.println(longestPalindrome(str));
    }
}