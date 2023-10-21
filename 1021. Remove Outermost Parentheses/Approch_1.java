import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class Approch_1{
     public static String removeOuterParentheses(String s) {
        Stack<Character> bracket=new Stack<>();
        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }else{
                bracket.pop();
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String [] args){
        BufferReader read=new BufferReader(new InputStreamReader(System.in));

        String result= removeOuterParentheses((String) read.readLine());
        System.out.print(result);
    }
}