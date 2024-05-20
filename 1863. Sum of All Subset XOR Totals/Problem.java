class Problem {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        generate(nums,0,res,new ArrayList<>());

        int sum = 0;

        for(List<Integer> temp : res){
            int data = 0;
            for(int val : temp){
                data ^= val;
            }
            sum += data;
        }

        return sum;
    }

    private void generate(int[] nums, int index, List<List<Integer>> res,List<Integer> temp){
        res.add(new ArrayList<>(temp));

        for(int i=index; i<nums.length; i++){
            temp.add(nums[i]);
            generate(nums,i+1,res,temp);
            temp.remove(temp.size()-1);
        }
    }
}