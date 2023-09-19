// Fast Slow Pointers
//time O(n)
//space O(1)
public class Approach4{
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;

        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static void main(String [] args){
        Approach4 obj=new Approach4();
        int[] arr={1,3,4,2,2};

        int res=obj.findDuplicate(arr);
        System.out.println(res);
    }
}