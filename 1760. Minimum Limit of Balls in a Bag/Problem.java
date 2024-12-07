class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low=1, high=1000000000;

        while(low<high){
            int mid=low+(high-low)/2, count=0;

            for(int val:nums){
                count+=(val-1)/mid;
            }
            if(count>maxOperations){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}