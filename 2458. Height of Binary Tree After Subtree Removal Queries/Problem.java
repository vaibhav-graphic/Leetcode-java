class Problem {
    private int[] level = new int[1000001];
    private int[] height = new int[1000001];
    private int[] maxHeight = new int[1000001];
    private int[] secMaxHeight = new int[1000001];

    public int[] treeQueries(TreeNode root, int[] queries) {
        findHeight(root, 0);
        int m = queries.length;

        int[] ans = new int[m];

        for(int i=0; i<m; i++){
            int val = queries[i];

            int l = level[val];
            int h = maxHeight[l] == height[val] ? secMaxHeight[l] : maxHeight[l];

            ans[i] = l + h - 1; 
        }

        return ans;
    }

    private int findHeight(TreeNode root, int levelCount){
        if(root == null){
            return 0;
        }

        level[root.val] = levelCount;
        height[root.val] = Math.max( findHeight(root.left, levelCount + 1), findHeight(root.right, levelCount + 1) ) + 1;

        if(maxHeight[levelCount] < height[root.val]){
            secMaxHeight[levelCount] = maxHeight[levelCount];
            maxHeight[levelCount] = height[root.val];
        }
        else if(secMaxHeight[levelCount] < height[root.val]){
            secMaxHeight[levelCount] = height[root.val];
        }

        return height[root.val];
    }
}