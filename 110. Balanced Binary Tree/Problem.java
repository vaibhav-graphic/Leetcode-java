class Problem {
    public boolean isBalanced(TreeNode root) {
        boolean[] res = {true};

        dfs(root, res);

        return res[0];
    }

    private int dfs(TreeNode root, boolean[] res){
        if(root == null){
            return 0;
        }

        int left = dfs(root.left, res);
        int right = dfs(root.right, res);

        if(Math.abs(left - right) > 1){
            res[0] = false;
        }

        return 1 + Math.max(left, right);
    }
}