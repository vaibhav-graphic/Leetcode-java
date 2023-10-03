public class Approch3 {

    public static int majorityElement(int[] nums){
        int major=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                major=nums[i];
                count=1;
            }
            else if(nums[i]==major){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};

        System.out.print(majorityElement(arr));
    }
}
