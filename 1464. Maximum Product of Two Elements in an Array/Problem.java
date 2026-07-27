class P {
    public int maxProduct(int[] nums) {
        int l = 0;
        int sl = 0;

        for(int val : nums){
            if(val > l){
                sl = l;
                l = val;
            }else{
                sl = Math.max(sl,val);
            }
        }

        return (l - 1)*(sl - 1);
    }
}