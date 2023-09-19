// mark array negative
//time O(n)
//space O(1)
public class Approach3{
    public int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);

            if(nums[index]<0)
                return index;

            nums[index]=-nums[index];    
        }
        return -1;
    }
    public static void main(String [] args){
        Approach3 obj=new Approach3();
        int[] arr={3,1,3,4,2};

        int res=obj.findDuplicate(arr);
        System.out.println(res);
    }
}