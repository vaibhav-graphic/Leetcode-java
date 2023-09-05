import java.util.List;
import java.util.ArrayList;

class Comnination_Sun_II{

    public List<List<Integer>> combinationSum2(int []candidates,int target){
        Arrays.sort(nums);
        List<List<Integer>> res =new ArrayList<>();
        solve(0,candidates,target,res,new ArrayList<>());
        return res;
    }

    private void solve(int index,int []nums,int target,List<List<Integer>> res,List<Integer> curr){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(target<0) return;

        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            solve(i+1, nums, target-nums[i], res, curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        Comnination_Sun_II obj=new Comnination_Sun_II();
        int []arr={10,1,2,7,6,1,5};
        int target=7;
        List<List<Integer>> res=obj.combinationSum2(arr,target);
        System.out.println(res);
    }
}
