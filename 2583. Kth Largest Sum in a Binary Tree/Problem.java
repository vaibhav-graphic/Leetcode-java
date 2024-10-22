class Problem {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        q.offer(root);
        pq.offer((long)root.val);

        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;

            for(int i=0; i<size; i++){
                TreeNode node = q.poll();

                if(node.left != null){
                    sum += node.left.val;
                    q.offer(node.left);
                }

                if(node.right != null){
                    sum += node.right.val;
                    q.offer(node.right);
                }
            }
            if(sum != 0 && pq.size() < k){
                pq.offer(sum);
            }
            else if(sum > pq.peek()){
                pq.poll();
                pq.offer(sum);
            }
        }

        return pq.size() < k ? -1 : pq.peek();
    }
}