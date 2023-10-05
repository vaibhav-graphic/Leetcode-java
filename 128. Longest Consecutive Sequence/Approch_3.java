//t O(3n)
//s O(n)
import java.util.HashSet;
import java.util.Set;

public class Approch_3 {
    public static int longestConsecutive(int[] nums) {
       int n=nums.length;
       int longest=1;

       if(n==0) return 0;

       Set<Integer> set=new HashSet<>();

       for(int i=0;i<n;i++){
           set.add(nums[i]);
       } 

       for(int it:set){
           if(!set.contains(it-1)){
               int x=it;
               int count=1;

               while(set.contains(x+1)){
                   x++;
                   count++;
               }
             longest=Math.max(longest,count);
           }
       }
       return longest;
    }
    public static void main(String [] args){
        int arr[]={0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(arr));
    }   
}
