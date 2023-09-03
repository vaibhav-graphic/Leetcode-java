//time c - O(n*2^n)
//space c - O(n*n*2^n)
import java.util.ArrayList;
import java.util.List;

class Subsets_78{

    public List<List<Integer>> subsets(int [] nums){
        List<List<Integer>> res=new ArrayList<>();
        allSubsets(0,nums,res,new ArrayList<>());
        return res;
    }

    private void allSubsets(int index, int [] nums, List<List<Integer>> res, List<Integer> curr){
        res.add(new ArrayList<>(curr));

        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            allSubsets(i+1, nums, res, curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String [] args){
        Subsets_78 obj=new Subsets_78();

        int [] arr={1,2,3};
        List<List<Integer>> res = obj.subsets(arr);
        System.out.println(res);
    }
}
