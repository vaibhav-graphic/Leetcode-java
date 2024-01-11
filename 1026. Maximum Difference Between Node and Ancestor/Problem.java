class Problem {

    private int findMax(TreeNode root, int minV, int maxV){
        if(root == null){
            return Math.abs(minV - maxV);
        }

        minV = Math.min(minV,root.val);
        maxV = Math.max(maxV,root.val);

        int l = findMax(root.left,minV,maxV);
        int r = findMax(root.right,minV,maxV);

        return Math.max(l,r);
    }
    public int maxAncestorDiff(TreeNode root) {
        return findMax(root,root.val,root.val);
    }
}