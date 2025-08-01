class Pro {
    private List<Integer> getRow(int row){
        long ans = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        
        for(int col = 1; col < row; col++){
            ans = ans * (row - col);
            ans = ans / col;
            temp.add((int)ans);
        }

        return temp;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){
            res.add(getRow(i));
        }

        return res;
    }
}