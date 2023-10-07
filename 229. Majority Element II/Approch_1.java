import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Approch_1{
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        n/=3;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n){
                res.add(entry.getKey());
            }
        }
        return res;        
    }
    public static void main(String [] args){
        Approch_1 obj=new Approch_1();
        int[] arr={3,2,3};

        List<Integer>res=obj.majorityElement(arr);

        System.out.println(res.toString());
    }
}