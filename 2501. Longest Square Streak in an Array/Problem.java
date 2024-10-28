class Problem {
    public int longestSquareStreak(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int i=0; i<nums.length; i++){
            int len = check(nums[i], set);
            maxLen = Math.max(maxLen, len);
        }

        return maxLen >= 2 ? maxLen : -1;
    }

    private int check(long num, HashSet<Integer> set){
        int len = 0;
    
        while(set.contains((int)num)){
            len++;

            if(num * num > 1e5){
                break;
            }

            num = num * num;
        }

        return len;
    }
}