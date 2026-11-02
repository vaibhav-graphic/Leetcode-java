class Problem {
    public int minMoves2(int[] nums) {
     Arrays.sort(nums);

     int low=0, high=nums.length-1,count=0;

     while(low<high){
         count+=Math.abs(nums[low]-nums[high]);

         low++;
         high--;
     }
     return count;  
    }
}