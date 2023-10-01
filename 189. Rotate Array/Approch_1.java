import java.util.Arrays;

class Approch_1{
    public static void rotate(int[] nums, int k) {
        if(nums.length<k){
           k-=nums.length;
        }

        if(nums.length<k && k%2!=0){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
            return;
        }

       int n=nums.length;
       int[] res=new int[n];
        int j=0,l=0;
        for(int i=k;i<res.length && j<n;i++){
            res[i]=nums[j];
            j++;
        }

        while(j<n){
            res[l]=nums[j];
            l++;
            j++;
        }

        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
    public static void main(String [] args){
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr, k);
        System.out.print(Arrays.toString(arr));
    }
}