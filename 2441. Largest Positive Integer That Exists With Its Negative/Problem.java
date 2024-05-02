class Problem {
    public int findMaxK(int[] nums) {
        int[] arr = new int[2001];
        int res = -1;

        for(int num : nums){
            if(arr[-num + 1000] == 1){
                res = Math.max(res,Math.abs(num));
            }

            arr[num + 1000] = 1;
        }

        return res;
    }
}