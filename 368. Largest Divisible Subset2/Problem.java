class Problem {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n =nums.length;
        int[] dp = new int[n];
        int[] hash = new int[n];

        Arrays.fill(dp, 1);
        Arrays.sort(nums);

        int maxLen = 1;
        int lastInd = 0;

        for(int i = 0; i < n; i++){
            hash[i] = i;
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                    hash[i] = j; 
                }
            }

            if(dp[i] > maxLen){
                maxLen = dp[i];
                lastInd = i;
            }
        }

        List<Integer> res = new ArrayList<>();

        while(hash[lastInd] != lastInd){
            res.add(0, nums[lastInd]);
            lastInd = hash[lastInd];
        }

        res.add(0, nums[lastInd]);

        return res;
    }
}