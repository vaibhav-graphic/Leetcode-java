class Problem {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;

        int minPos = -1;
        int maxPos = -1;
        int leftBo = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < minK || nums[i] > maxK) {
                leftBo = i;
            }

            if (nums[i] == minK) {
                minPos = i;
            }
            if (nums[i] == maxK) {
                maxPos = i;
            }

            int count = Math.min(maxPos, minPos) - leftBo;

            ans += (count <= 0) ? 0 : count;
        }

        return ans;
    }
}