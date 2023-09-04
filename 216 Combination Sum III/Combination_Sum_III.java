import java.util.List;
import java.util.ArrayList;

public class Combination_Sum_III {

    public List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> res=new ArrayList<>();
        solve(1,n,k,res,new ArrayList<>());
        return res;
    }
    
    private void solve(int start,int n, int k,List<List<Integer>> res, List<Integer> curr){
        
        if(curr.size()==k && n==0){
            res.add(new ArrayList<>(curr));
        }

        for(int i=start;i<=9;i++){
            curr.add(i);
            solve(i+1,n-i,k,res,curr);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String [] args){
        Combination_Sum_III obj=new Combination_Sum_III();
        int k=9;
        int n=45;
        List<List<Integer>> res= obj.combinationSum3(k,n);
        System.out.println(res);
    }
}
