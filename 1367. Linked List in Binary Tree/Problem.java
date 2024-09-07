class Problem {

    public boolean isSubPath(ListNode head, TreeNode root) {
        
        if(root == null){
            return false;
        }

        return check(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean check(ListNode head, TreeNode root){
        if(head == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if(root.val != head.val){
            return false;
        }

        boolean left = check(head.next, root.left);
        boolean right = check(head.next, root.right);

        return left || right;
    }
}