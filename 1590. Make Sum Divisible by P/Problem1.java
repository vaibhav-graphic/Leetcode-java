class Problem1 {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        int sum = 0;

        for(int val : nums){
            sum = (sum + val) % p; 
        }

        int target = sum % p;

        if(target == 0){
            return 0;
        }

        hm.put(0, -1);
        int curr = 0;
        int minLen = n;

        for(int i=0; i<n; i++){
            curr = (curr + nums[i] ) % p;
            
            int remain = (curr - target + p) % p;
            
            if(hm.containsKey(remain)){
                minLen = Math.min(minLen, i - hm.get(remain));
            }

            hm.put(curr, i);
        }

        return minLen == n ? -1 : minLen;
    }
}