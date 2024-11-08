class Problem2 {
    public int[] getMaximumXor(int[] nums, int power) {
        int n = nums.length;
        int xor = 0;
        int[] xorArr = new int[n];
        int limit = (int) Math.pow(2, power);

        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            xorArr[i] = xor;
        }

        for (int i = n - 1; i >= 0; i--) {
            int data = xorArr[i];
            int mask = (1 << power) - 1; 
            xorArr[i] = data ^ mask; 
        }

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int temp = xorArr[i];
            xorArr[i] = xorArr[j];
            xorArr[j] = temp;
            i++;
            j--;
        }

        return xorArr;
    }
}