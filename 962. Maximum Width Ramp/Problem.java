class Problem {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int maxWidth = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            if(stack.isEmpty() || nums[i] < nums[ stack.peek() ]){
                stack.push(i);
            }
        }

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]){
                maxWidth = Math.max(maxWidth, i - stack.pop());
            }
        }

        return maxWidth;
    }
}