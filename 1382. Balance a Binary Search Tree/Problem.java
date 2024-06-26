class Problem {
    public TreeNode balanceBST(TreeNode root) {
        if(root == null){
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        TreeNode dummy = new TreeNode();
        dummy.left = create(0,list.size()-1,list);
        return dummy.left;
    }

    private TreeNode create(int st,int ed,ArrayList<Integer> list){
        if(st > ed){
            return null;
        }
        int mid = (st + ed) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = create(st,mid-1,list);
        node.right = create(mid+1,ed,list);
        return node;
    }

    private void inOrder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}