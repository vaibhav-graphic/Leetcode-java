import java.util.ArrayList;
import java.util.List;

class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        solve("(",1,0,res,n);
        return res;
    }

    private void solve(String parenthesis,int o,int c,List<String> res,int n){
        if(parenthesis.length()==2*n){
            res.add(parenthesis);
            return;
        }

        if(o<n) solve(parenthesis+"(",o+1,c,res,n);
        if(c<o) solve(parenthesis+")",o,c+1,res,n);
    }

    public static void main(String [] args){
        Generate_Parentheses obj=new Generate_Parentheses();

        int n=3;
        List<String> res=obj.generateParenthesis(n);
        System.out.println(res);
    }
}