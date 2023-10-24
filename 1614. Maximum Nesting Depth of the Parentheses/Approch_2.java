public class Approch_2 {
    public static int maxDepth(String s) {
        if(s.length()==1) return 0; 
        int count=0;
        int max=Integer.MIN_VALUE;
 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            max=Math.max(max,count); 
            if(ch=='('){
                count++;
            }else if(ch==')'){
                count--;
            }
        }
        return max;
     }
    public static void main(String[] args) {
        String str="(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(str));
    }
}
