class Problem1 {
    public int[] getMaximumXor(int[] nums, int power) {
        int n = nums.length;
        int xor = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
        }

        for (int i = 0; i < n; i++) {
            int data = xor;
            int mask = (1 << power) - 1; 
            ans[i] = data ^ mask;
            xor = xor ^ nums[n - i - 1];
        }

        return ans;
    }
}