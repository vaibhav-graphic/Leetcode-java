//time O(n logn)
//space O(n)
//useing sorting 

import java.util.Arrays;

class Approch1{
     public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] arr=t.toCharArray();
        char[] arr1=s.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);


        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr[i])
             return false;
        }
        return true;
    }
    public static void main(String [] args){
        String s="anagram";
        String t="nagaram";

        System.out.print(isAnagram(s, t));
    }
}