// The time complexity of this code is O(n),
//  where 'n' is the length of the longer of the two input strings s and t.
//   This is because the code iterates through both strings once,
//    performing constant-time operations for each character.

// The space complexity is O(k), where 'k' is the number of unique characters in both strings combined.
//  In the worst case,
//   if all characters are unique, 'k' would be equal to the sum of the lengths of s and t.
//    However, if there is a limited character set (e.g., only lowercase letters),
//     'k' would be a constant and the space complexity would be O(1).

//time O(n)
//space O(1)

import java.util.HashMap;

public class Approch2 {
    public static boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> map=new HashMap<>();

       for(char x:s.toCharArray()){
           map.put(x, map.getOrDefault(x, 0) +1);
       }

       for(char x:t.toCharArray()){
           map.put(x, map.getOrDefault(x, 0)-1);
       }
       
       for(int val:map.values()){
           if(val!=0)
            return false;
       }

       return true;
    }
    public static void main(String [] args){
        String s="anagram";
        String t="naagram";

        System.out.print(isAnagram(s, t));
    }
}
