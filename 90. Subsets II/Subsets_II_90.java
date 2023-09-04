import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Subsets_II_90{

    public List<List<Integer>> subsetWithDup(int []nums){
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,res,new ArrayList<>());
        return res;
    }

    private void solve(int index, int [] nums, List<List<Integer>> res, List<Integer> curr){
        res.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i-1]==nums[i]) continue;
            curr.add(nums[i]);
            solve(i+1,nums,res,curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String [] args){
        Subsets_II_90  obj=new Subsets_II_90();
        int []arr={2,1,2};

        List<List<Integer>> res= obj.subsetWithDup(arr);
        System.out.println(res);

    }
}