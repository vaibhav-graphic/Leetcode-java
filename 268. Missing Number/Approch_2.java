class Approch_2{

    public static int missingNumber(int[] nums) {
        int res=nums.length;

        for(int i=0;i<nums.length;i++){
            res^=i;
            res^=nums[i];
        }
        return res;
    }
    public static void main(String [] args){
        int arr[]={9,6,4,2,3,5,7,0,1};
        
        System.out.print(missingNumber(arr));
    }
}