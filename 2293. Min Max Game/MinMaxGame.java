class MinMaxGame{
    public static int minMaxGame(int[] nums) {
        for(int n=nums.length;n>1;n-=(n/2)){
            for(int i=0;i<n/2;i++){
                if(i%2==1){
                    nums[i]=Math.max(nums[2*i],nums[2*i+1]);
                }else{
                    nums[i]=Math.min(nums[2*i],nums[2*i+1]);
                }
            }
        }
        return nums[0];
     }
    public static void main(String[] args){
        int[] arr={1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(arr));
    }
}