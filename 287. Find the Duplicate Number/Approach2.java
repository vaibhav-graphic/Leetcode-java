// Sortin useing merge sort
//time O(nlogn)
//space O(1)

import java.util.*;

public class Approach2{
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Approach2 obj=new Approach2();
        int[] arr={3,1,3,4,2};

        int res=obj.findDuplicate(arr);
        System.out.println(res);
    }
}