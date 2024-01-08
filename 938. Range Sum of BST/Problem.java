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
    
    private int inorder(TreeNode root,int l ,int h){
        if(root == null){
            return 0;
        }

        int count = 0;

        if(root.val > l){
            count += inorder(root.left,l,h);
        }
        if(root.val >= l && root.val <= h){
            count += root.val;
        }
        if(root.val < h){
            count += inorder(root.right,l,h);
        }

        return count;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return inorder(root,low,high);
    }
}