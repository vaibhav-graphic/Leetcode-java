class Problem {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        boolean even = true;

        while (!q.isEmpty()) {
            int n = q.size();
            int prev = 0;
            if (even) {
                prev = Integer.MIN_VALUE;
            } else {
                prev = Integer.MAX_VALUE;
            }

            while (n-- > 0) {
                TreeNode curr = q.poll();

                if(even && (curr.val % 2 == 0 || curr.val <= prev)){
                    return false;
                }
                if(!even && (curr.val % 2 != 0 || curr.val >= prev)){
                    return false;
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }

                prev = curr.val;
            }
            even = !even;
        }
        return true;
    }
}