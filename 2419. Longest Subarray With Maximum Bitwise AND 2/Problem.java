class Problem {
    public int longestSubarray(int[] nums) {
       int maxEle = 0;
       int res = 0;
       int count = 0;

       for(int num : nums){
        if(num > maxEle){
            maxEle = num;
            res = 0;
            count = 0;
        }

        if(maxEle == num){
            count++;
        }else{
            count = 0;
        }

        res = Math.max(res, count);
       } 

       return res;
    }
}