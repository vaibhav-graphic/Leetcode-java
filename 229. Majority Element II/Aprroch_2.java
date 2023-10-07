import java.util.ArrayList;
import java.util.List;

public class Aprroch_2 {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int count1=0,ele1=Integer.MIN_VALUE;
        int count2=0,ele2=Integer.MIN_VALUE;
        List<Integer>res=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(count1==0 && ele2!=nums[i]){
                ele1=nums[i];
                count1++;
            }
            else if(count2==0 && ele1!=nums[i]){
                ele2=nums[i];
                count2=1;
            }
            else if(nums[i]==ele1){
                count1++;
            }
            else if(nums[i]==ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(ele1==nums[i]) count1++;
            if(ele2==nums[i]) count2++;
        }

        int min=(int)(n/3) +1;
        if(count1>=min) res.add(ele1);
        if(count2>=min) res.add(ele2);
        return res;
    }

    public static void main(String[] args) {
        Aprroch_2 obj=new Aprroch_2();
        int[] arr={3,2,2,3,2,2,3};

        List<Integer> res=obj.majorityElement(arr);
        System.out.println(res.toString());
    }
}