Problem {
    public int[] singleNumber(int[] nums) {
        long xor = 0;

        for(int val : nums){
            xor ^= val;
        }

        long mask = xor & (-xor);
        int ele1 = 0;
        int ele2 = 0;

        for(int val : nums){
            if( (val & mask) != 0){
                ele1 ^= val;
            }else{
                ele2 ^= val;
            }
        }

        return new int[]{ele1,ele2};
    }
}