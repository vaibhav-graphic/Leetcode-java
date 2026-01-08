class Problem {
    private int getSum(TreeNode root){
        if(root == null){
            return 0;
        }

        int l = getSum(root.left);
        int r = getSum(root.right);

        root.val = root.val + l + r;

        return root.val;
    }

    private void dfs(TreeNode root, long[] ans, int totalSum){
        if(root == null){
            return;
        }

        int remain = totalSum - root.val;
        long data = (long) remain * root.val;
        ans[0] = Math.max(ans[0], data);

        dfs(root.left, ans, totalSum);
        dfs(root.right, ans, totalSum);
    }

    public int maxProduct(TreeNode root) {
        int totalSum = getSum(root);

        long[] ans = {0};

        dfs(root, ans, totalSum);

        return (int) (ans[0] % 1_000_000_007);
    }
}