class Problem {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
        return dfs(root,null);
    }

    private int dfs(TreeNode root, TreeNode parent){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            if(parent != null && parent.left == root){
                return root.val;
            }
        }

        int left =  dfs(root.left,root);
        int right = dfs(root.right,root);
        return left + right;   
    }
}