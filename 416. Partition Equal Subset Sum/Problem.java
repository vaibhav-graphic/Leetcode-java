class Problem {
    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int target = 0;

        for(int num : nums){
            target += num;
        }

        if(target % 2 != 0){
            return false;
        }

        target /= 2;

        boolean[] prev = new boolean[target + 1];

        prev[0] = true;

        if(target >= nums[0]){
            prev[nums[0]] = true;
        }

        for(int ind = 1; ind < n; ind++){
            boolean[] temp = new boolean[target + 1];
            temp[0] = true;

            for(int tar = 1; tar <= target; tar++){
                boolean notTake = prev[tar];
                boolean take = false;

                if(tar >= nums[ind]){
                    take = prev[tar - nums[ind]];
                }

                temp[tar] = notTake || take;
            }

            prev = temp;
        }

        return prev[target];
    }
}