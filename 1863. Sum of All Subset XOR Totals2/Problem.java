class Problem {
    public int subsetXORSum(int[] nums) {
        int xor = 0;
        return generate(nums,0,xor);
    }

    private int generate(int[] nums, int index,int xor){
       if(index == nums.length){
        return xor;
       }

        int include = generate(nums,index+1,nums[index] ^ xor);
        int exclude = generate(nums,index+1,xor);
            
        return include + exclude;
    }
}