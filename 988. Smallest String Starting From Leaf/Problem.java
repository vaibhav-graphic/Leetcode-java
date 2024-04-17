class Problem {
    String res = "";
    public String smallestFromLeaf(TreeNode root) {
        solve(root,"");
        return res;
    }

    private void solve(TreeNode root,String str){
        if(root == null){
            return;
        }

        str = (char)(97 + root.val) + str; 
        if(root.left == null && root.right == null){
            if(res.equals("") || res.compareTo(str) > 0){
                res = str;
            }
            return;
        }

        
        solve(root.left,str);        
        solve(root.right,str);
    }
}

