/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Problem {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapper = new LinkedList<>();

        if(root == null) return wrapper;

        queue.offer(root);

        while(!queue.isEmpty()){
            int level = queue.size();

            List<Integer> subList = new LinkedList<>();

            for(int i=0; i<level; i++){

                //left insert int queue
                if( queue.peek().left != null) {
                    queue.offer( queue.peek().left );
                }

                //right insert in queue
                if( queue.peek().right != null){
                    queue.offer( queue.peek().right );
                }

                // remove the root from front of queue
                subList.add(queue.poll().val);
            }

            wrapper.add(subList);
        }

        return wrapper;
    }
}