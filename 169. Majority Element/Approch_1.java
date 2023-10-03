import java.util.Arrays;

class Approch_1{
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) {
            int ans=nums[0];
            return ans;
        }
        int maj=nums.length/2;
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>maj){
                    int ans=nums[i];
                    return ans;
                }
            }else{
                count=1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};

        System.out.print(majorityElement(arr));
    }
}