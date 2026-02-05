class Problem {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                res[i] = nums[i];
            }
            else if(nums[i] > 0){
                res[i] = findRight(nums, nums[i], i);
            }else{
                res[i] = findLeft(nums, nums[i] * -1, i);
            }
        }

        return res;
    }

    private int findRight(int[] nums, int run, int index){
        int n = nums.length;

        if(run > n){
            run = run % n;
        }

        while(run-- > 0){
            index++;

            if(index == n){
                index = 0;
            }

            if(run == 0){
                return nums[index];
            }
        }
        
        return nums[index];
    }

    private int findLeft(int[] nums, int run, int index){
        int n = nums.length;

        if(run > n){
            run = run % n;
        }

        while(run-- > 0){
            index--;

            if(index == -1){
                index = n - 1;
            }

            if(run == 0){
                return nums[index];
            }
        }

        return nums[index];
    }
}