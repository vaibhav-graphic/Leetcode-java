class Problem {
    private void fill(TreeNode root, HashMap<Integer,ArrayList<TreeNode>> hm){
        Queue<TreeNode> q = new LinkedList<>();
        int depth = 0;

        hm.put(0, new ArrayList<>());
        q.offer(root);
        while(!q.isEmpty()){
            depth++;
            int size = q.size();
            ArrayList<TreeNode> list = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                list.add(node);

                if(node.left != null){
                    q.offer(node.left);
                }

                if(node.right != null){
                    q.offer(node.right);
                }
            }
            hm.put(depth, list);
        }
    }

    public TreeNode replaceValueInTree(TreeNode root) {
        HashMap<Integer,ArrayList<TreeNode>> hm = new HashMap<>();
        fill(root, hm);
        solve(root, hm, 0);
        return root;
    }

    private void solve(TreeNode root, HashMap<Integer,ArrayList<TreeNode>> hm, int depth){
        if(root == null){
            return;
        }

        solve(root.left, hm, depth + 1);
        ArrayList<TreeNode> list = hm.get(depth);

        for(TreeNode parentNode : list){
            int sum = 0;
            if(parentNode.left != null && parentNode.left != root){
                sum +=
            }
        }
        solve(root.right, hm, depth + 1);
    }
}