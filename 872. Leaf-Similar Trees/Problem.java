class Problem {

    private void inorder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }

        inorder(root.left,ans);
        if(root.left == null && root.right == null){
            ans.add(root.val);
        }
        inorder(root.right,ans);

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();

        inorder(root1,s1);
        inorder(root2,s2);

        if(s1.size() != s2.size()) return false;

        for(int i=0; i<s1.size(); i++){
            if(s1.get(i) != s2.get(i)){
                return false;
            }
        }

        return true;
    }
}