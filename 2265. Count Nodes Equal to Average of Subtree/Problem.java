class Pair{
    int nodeSum;
    int nodeNo;

    Pair(int nodeSum, int nodeNo){
        this.nodeSum = nodeSum;
        this.nodeNo = nodeNo;
    }
}

class Problem {
    private Pair dfs(TreeNode root, int[] count){
        if(root == null){
            return new Pair(0, 0);
        }

        Pair p1 = dfs(root.left, count);
        Pair p2 = dfs(root.right, count);

        int totalSum = p1.nodeSum + p2.nodeSum + root.val;
        int totalNode = p1.nodeNo + p2.nodeNo + 1;
        int avg = Math.round(totalSum / totalNode);

        if(avg == root.val){
            count[0]++;
        }

        return new Pair(totalSum, totalNode);
    }

    public int averageOfSubtree(TreeNode root) {
        if(root == null){
            return 0;
        }       

        int[] count = {0};   

        dfs(root, count);

        return count[0];
    }
}