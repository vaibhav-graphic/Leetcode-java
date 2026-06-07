class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> hm = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int[] description : descriptions){
            TreeNode parent = hm.containsKey(description[0]) == true ? hm.get(description[0]) : new TreeNode(description[0]);
            TreeNode child = hm.containsKey(description[1]) == true ? hm.get(description[1]) : new TreeNode(description[1]);
            int dir = description[2];

            hm.put(parent.val, parent);
            hm.put(child.val, child);

            set.add(child.val);

            if(dir == 1){
                parent.left = child;
            }else{
                parent.right = child;
            }
        }

        for(int[] description : descriptions){
            if(!set.contains(description[0])){
                return hm.get(description[0]);
            }
        }

        return null;
    }
}