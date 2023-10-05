public class Approch_2 {
    public static int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;

        for(int i=0;i<n;i++){
            int x=nums[i];
            int count=1;

            while(linearSearch(nums,x+1)==true){
                x++;
                count++;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

    private static boolean linearSearch(int[] nums,int value){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr[]={0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(arr));
    }   
}
