class Problem {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count = 0;
        long max = Integer.MIN_VALUE;
        int ans = 0;

        while(!q.isEmpty()){
            int size = q.size();
            count++;
            long sum = 0;

            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                sum += (long)node.val;

                if(node.left != null){
                    q.offer(node.left);
                }

                if(node.right != null){
                    q.offer(node.right);
                }
            }

            if(sum > max){
                max = sum;
                ans = count;
            }
        }

        return ans;
    }
}