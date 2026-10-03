class Problem {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(n,"(",1,0,res);
        return res;
    }
    private void solve(int n,String str,int o,int c,List<String> res){
        if(str.length() == n*2){
            res.add(str);
            return;
        }

        if(o<n){
            solve(n,str + "(",o+1,c,res);
        }

        if(c < o){
            solve(n,str + ")",o,c+1,res);
        }
    }
}