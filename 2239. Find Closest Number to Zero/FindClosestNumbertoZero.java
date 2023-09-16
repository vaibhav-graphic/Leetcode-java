class FindClosestNumbertoZero{
    public static int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int ans=0;

        for(int n:nums){
            if(min>Math.abs(n)){
                min=Math.abs(n);
                ans=n;
            }else if(min==Math.abs(n) && ans<n){
                ans=n;
            }
        }
        return ans;
    }

    public static void main(String []args){
        int[] arr={-4,-2,1,4,8};
        System.out.println(findClosestNumber(arr));
    }
}