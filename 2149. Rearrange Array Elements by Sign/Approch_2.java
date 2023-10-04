import java.util.Arrays;

public class Approch_2 {
    public static int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=pos+1;
        int n=nums.length;
        int[] res=new int[n];
  
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res[pos]=nums[i];
                pos+=2;
            }else{
                res[neg]=nums[i];
                neg+=2;
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
