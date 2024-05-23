class Problem {
    private int res;
    private int K;
    public int beautifulSubsets(int[] nums, int k) {
        res = 0;
        K = k;

        HashMap<Integer,Integer> hm = new HashMap<>();

        generate(nums,0,hm);

        return res-1;
    }

    private void generate(int[] nums,int index,HashMap<Integer,Integer> hm){
        if(index >= nums.length){
            res++;
            return;
        }

        generate(nums,index+1,hm);

        if(!hm.containsKey(nums[index] + K) && !hm.containsKey(nums[index] - K)){
            hm.put(nums[index] , hm.getOrDefault(nums[index] , 0 ) + 1);

            generate(nums,index+1,hm);

            hm.put(nums[index], hm.get(nums[index]) - 1);

            if(hm.get(nums[index]) == 0){
                hm.remove(nums[index]);
            }
        }
    }
}