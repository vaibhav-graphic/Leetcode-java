class Solution{

    private static int minStartValue(int[] nums){
        int max=1;
        int sum=1;

        for(int i=0;i<nums.length;i++){
            sum-=nums[i];

            if(sum>max){
                max=sum;
            }
        }
        return max;
    } 
    public static void main(String [] args){
        int[] arr={-22,-29,-21,0,-4,-26,10,-11,-14,-11};

        System.out.println(minStartValue(arr));
    }
}