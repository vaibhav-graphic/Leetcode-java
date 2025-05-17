class Problem {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int i = 0;
        int k = n - 1;
        int j = 0;

        while(j <= k){
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[j] == 2){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
            }else{
                j++;
            }
        }
    }
}