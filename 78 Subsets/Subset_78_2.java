import java.util.ArrayList;
import java.util.List;

class Subsets_78_2{

    public List<List<Integer>> subsets(int [] nums){
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }

    private void backtrack(int[] nums,int index,List<Integer> ds,List<List<Integer>> result){
        if(index>=nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[index]);
        backtrack(nums,index+1,ds,result);
        ds.remove(ds.size()-1);
        backtrack(nums,index+1,ds,result);
    }
    public static void main(String [] args){
        Subsets_78_2 obj=new Subsets_78_2();

        int [] arr={1,2,3};
        List<List<Integer>> res = obj.subsets(arr);
        System.out.println(res);
    }
}
