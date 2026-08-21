class Problem {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int n = nums.length;
        
        l1.add(nums[0]);
        l2.add(nums[1]);
        
        for(int i=2; i<n; i++){
            if(l1.get(l1.size() - 1) > l2.get(l2.size() - 1)){
                l1.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }
        }
        int i = 0;
        
        for(int val : l1){
            nums[i++] = val;
        }
        for(int val : l2){
            nums[i++] = val;
        }
        
        return nums;
    }
}