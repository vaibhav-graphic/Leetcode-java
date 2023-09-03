import java.util.ArrayList;
import java.util.List;

class Combination_77{

    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> res= new ArrayList<>();
        allCombinationOfK(1,n,k,res,new ArrayList<>());
        return res;
    }

    private void allCombinationOfK(int start,int n,int k, List<List<Integer>> res, List<Integer> curr){
    
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            allCombinationOfK(i+1,n,k,res,curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String [] args){
        Combination_77 obj=new Combination_77();

        int n=4;
        int k=2;
        List<List<Integer>> res= obj.combine(n,k);
        System.out.println(res);
    }
}