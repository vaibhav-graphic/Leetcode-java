class Problem {
    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        solve(root);
        return root;
    }

    private void solve(TreeNode root){
        if(root == null){
            return;
        }

        solve(root.right);
        sum += root.val;
        root.val = sum;
        solve(root.left);
    }
}