class Problem {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        depth -= 1;
        
        if(depth == 0){
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count = 0;

        while(!q.isEmpty()){
            int size = q.size();
            count++;

            if(count ==  depth){
                
                System.out.print("Enter");

                for(int i=0; i<size; i++){
                    TreeNode node = q.poll();
                    TreeNode left = node.left;
                    TreeNode right = node.right;

                    TreeNode newNode = new TreeNode(val);
                        node.left = newNode;
                        newNode.left = left;

                        TreeNode newNode1 = new TreeNode(val);
                        node.right = newNode1;
                        newNode1.right = right;
                }
                return root;
            }

            for(int i=0; i<size; i++){
                TreeNode node = q.poll();

                if(node.left != null){
                    q.offer( node.left );
                }
                if(node.right != null){
                    q.offer( node.right );
                }
            }
        }

        return root;
    }
}