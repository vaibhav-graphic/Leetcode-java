class Problem {

    private int result;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        result = 0;
        solve(root);
        return result;
    }

    private int solve(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        result = Math.max(result,left+right);
        return Math.max(left,right)+1;
    }
}