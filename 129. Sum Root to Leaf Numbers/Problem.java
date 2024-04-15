class Problem {
    public int sumNumbers(TreeNode root) {
       return dfs(root,0); 
    }

    private int dfs(TreeNode root, int curr){
        if(root == null){
            return 0;
        }
        
        curr = (curr * 10 ) + root.val;
        if(root.left == null && root.right == null){
            return curr;
        }

        int l = dfs(root.left,curr);
        int r = dfs(root.right,curr);
        return l + r;
    }
}