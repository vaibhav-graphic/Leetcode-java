 import java.util.*;
 
 class ShortestDistance_to_a_Character {
     public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int prev = n+1, j;

        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                ans[i] = 0;
                prev = 1;
                j = i-1;
                while(j>=0 && ans[j]>i-j){
                    ans[j] = i-j;
                    j--;
                }
            }
            else
                ans[i] = prev++;
                System.out.println(ans[i]);
        }
        return ans;
    }

    public static void main(String [] args){
        String s="loveleetcode";
        char c='e';

        int[] res=shortestToChar(s, c);
        System.out.print(Arrays.toString(res));
    }
}