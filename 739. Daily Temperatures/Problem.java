class Problem {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && nums[i] >= nums[ s.peek() ]){
                s.pop();
            }

            if(s.isEmpty()){
                res[i] = 0;
            }else{
                res[i] = s.peek() - i;
            }
            s.push(i);
        }
        return res;
    }
}