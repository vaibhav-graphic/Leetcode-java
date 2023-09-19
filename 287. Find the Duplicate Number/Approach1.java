// Brute force
//time O(n^2)
//space O(1)
public class Approach1{
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    return nums[i];
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Approach1 obj=new Approach1();
        int[] arr={3,1,3,4,2};

        int res=obj.findDuplicate(arr);
        System.out.println(res);
    }
}