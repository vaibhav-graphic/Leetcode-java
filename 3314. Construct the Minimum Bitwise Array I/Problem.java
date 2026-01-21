class Problem {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            ans[i] = getElement(nums.get(i));
        }

        return ans;
    }

    private int getElement(int data){
        int num = 1;

        while(num <= data){
            if((num | (num + 1)) == data){
                return num;
            }
            num++;
        }

        return -1;
    }
}