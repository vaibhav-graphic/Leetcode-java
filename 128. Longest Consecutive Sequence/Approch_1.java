//t O(n*log n)
//s O(1)
import java.util.Arrays;

 class Approch_1{
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;

        int count=0, longest=1,last=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==last){
                count++;
                last=nums[i];
            }
            else if(nums[i]!=last){
                count=1;
                last=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
    public static void main(String [] args){
        int arr[]={0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(arr));
    }
}