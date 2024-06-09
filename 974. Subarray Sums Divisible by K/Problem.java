class Problem {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        int n = nums.length;
        int sum = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            int rem = sum % k;

            if(rem < 0){
                rem += k;
            }

            if(hm.containsKey(rem)){
                count += hm.get(rem);
            }

            hm.put(rem, hm.getOrDefault(rem,0)+1);
        } 
        return count;
    }
}