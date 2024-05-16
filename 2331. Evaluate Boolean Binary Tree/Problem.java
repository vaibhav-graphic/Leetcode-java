class Probelm {
    public boolean evaluateTree(TreeNode root){
        return solve(root);
    }

    private boolean solve(TreeNode root){
        if(root.left == null && root.right == null){
            return root.val != 0;
        }
        boolean left = solve(root.left);
        boolean  right  = solve(root.right);

        if(root.val == 2){
            return left | right;
        }

        return left & right;
    }
}