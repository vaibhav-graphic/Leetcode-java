import java.util.*;

class Approch_1{
    public  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            res.add(generateRow(i));
        }
        return res;
    }

    private  List<Integer> generateRow(int row){
        List<Integer> ans=new ArrayList<>();

        long gen=1;
        ans.add(1);
        for(int col=1;col<row;col++){
            gen*=(row-col);
            gen/=col;
            ans.add((int)gen);
        }
        return ans;
    }

    public void display(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String [] args){
        Approch_1 obj=new Approch_1();
        int n=5;

        List<List<Integer>> res=obj.generate(n);
        obj.display(res);
    }
}