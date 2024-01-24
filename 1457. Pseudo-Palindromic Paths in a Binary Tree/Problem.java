class Problem {
    int count = 0;

    private void solve(TreeNode root,int val){
        if(root == null){
            return;
        }

        val = (val ^ (1 << root.val));

        if(root.left == null && root.right == null){
            if((val & (val - 1)) == 0){
                count++;
            }
        }

        solve(root.left,val);
        solve(root.right,val);

    }
    public int pseudoPalindromicPaths (TreeNode root) {
        solve(root,0);
        return count;    
    }
}