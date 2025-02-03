class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        return Math.max( inc(nums) , dec(nums));
    }
    
    private int inc(int[] nums){
        int n = nums.length;
        int max = 1;
        int count = 1;
        
        for(int i=1; i<n; i++){
            if(nums[i] > nums[i-1]){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 1;
            }
        }
        return max;
    }
    
    private int dec(int[] nums){
        int n = nums.length;
        int max = 1;
        int count = 1;
        
        for(int i=1; i<n; i++){
            if(nums[i] < nums[i-1]){
                count++;
                max = Math.max(max,count);
            }else{
                count = 1;
            }
        }
        return max;
    }
}