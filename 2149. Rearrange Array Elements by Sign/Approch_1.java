import java.util.Arrays;

class Approch_1{

    public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0 && j<n){
                res[j]=nums[i];
                j+=2;
            }
        }

        j=1;

        for(int i=0;i<n;i++){
            if(nums[i]<0 && j<n){
                res[j]=nums[i];
                j+=2;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={3,1,-2,-5,2,-4};
        arr=rearrangeArray(arr);

        System.out.print(Arrays.toString(arr));
    }
}