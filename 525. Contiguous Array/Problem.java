class Problem {
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int sum = 0;
        int maxLen = 0;

        for(int i=0; i<n; i++){
            sum += nums[i] == 1 ? 1 : -1;

            if(hm.containsKey(sum)){
                maxLen = Math.max(maxLen, i - hm.get(sum));
            }else{
                hm.put(sum,i);
            }
        }
        return maxLen;
    }
}