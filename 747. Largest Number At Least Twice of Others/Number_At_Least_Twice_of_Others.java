class Number_At_Least_Twice_of_Others {

    private static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                res = i;
            }
        }

        nums[res] = 0;
        for (int i = 0; i < nums.length; i++) {
            int check = 0;

            check = nums[i] * 2;

            if (check > max)
                return -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 0 };

        System.out.println(dominantIndex(arr));
    }
}
