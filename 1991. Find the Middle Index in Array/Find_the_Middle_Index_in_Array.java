class Find_the_Middle_Index_in_Array{

    private static int findMiddleIndex(int[] nums){
        int t=0;
        int l=0;

        for(int i=0;i<nums.length;i++)
            t+=nums[i];

            for(int i=0;i<nums.length;i++){
                if(l==t-l-nums[i])
                    return i;
            l+=nums[i];
        }  
        return -1;          
    }
    public static void main(String [] args){
        int arr[]={2,3,-1,8,4};
        System.out.print(findMiddleIndex(arr));
    }
}