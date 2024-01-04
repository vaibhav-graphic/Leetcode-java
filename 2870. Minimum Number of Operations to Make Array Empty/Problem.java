class Problem {
    public int minOperations(int[] nums) {
        
        int n = nums.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0) + 1);
        }
        
        int res = 0;

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int val = entry.getValue();

            if(val == 1){
                return -1;
            }
            else if(val %2 == 0 && val %3 ==0){
                res += val /3;
            }
            else if(val %3 == 0){
                res += val/3;
            }else{
                res += Math.ceil((double)val / 3);
            }
        }

        return res;
    }
}