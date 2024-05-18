class Problem {
    int count = 0;
    public int distributeCoins(TreeNode root) {
        solve(root);
        return count;
    }

    private int solve(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);
        count += Math.abs(left) + Math.abs(right);

        return (left + right + root.val) - 1;
    }
}