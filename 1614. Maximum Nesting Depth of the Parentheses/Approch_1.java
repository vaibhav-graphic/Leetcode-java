import java.util.Stack;

class Approch_1{

    public static int maxDepth(String s) {
       Stack<Character> sk=new Stack<>();
       int max=Integer.MIN_VALUE;

       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           max=Math.max(max,sk.size());

           if(ch=='('){
               sk.push(ch);
           }
           else if(ch==')'){
               if(sk.size()>0){
                sk.pop();
               }
           }
       } 
       return max;
    }
    public static void main(String [] args){
        String str="(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(str));
    }
}