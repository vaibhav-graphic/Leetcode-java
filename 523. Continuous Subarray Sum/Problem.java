class Problem {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;

        if(n == 1) return false;

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
            int rem = sum % k;

            if(hm.containsKey(rem)){
                int index = hm.get(rem);
                int len = i - index;
                // return len >= 2 ? true : false;
                if(len >= 2) return true;
            }else{
                hm.put(rem,i);
            }
        }
        return false;
    }
}