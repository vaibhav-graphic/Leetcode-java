class Problem1 {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int max = 0;
        int sum = 0;

        int[] freq = new int[101];

        for(int val : nums){
            freq[ val ]++;

            int count = freq[ val ];

            if(count > max){
                max = count;
                sum = max;
            }
            else if(count == max){
                sum += max;
            }
        }
        return sum;
    }
}