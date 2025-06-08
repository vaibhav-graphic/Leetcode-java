class Problem {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();

        for(int i=1; i<10; i++){
            solve(i, n, res);
        }

        return res;
    }

    private void solve(int currNum, int limit, List<Integer> res){
        if(currNum > limit){
            return;
        }

        res.add(currNum);

        for(int append = 0; append < 10; append++){
            int newNum = currNum * 10 + append;

            if(newNum > limit){
                return;
            }

            solve(newNum, limit, res);
        }
    }
}