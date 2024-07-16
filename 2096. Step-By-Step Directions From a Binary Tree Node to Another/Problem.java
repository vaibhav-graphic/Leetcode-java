class Problem {
    public String getDirections(TreeNode root, int startValue, int destValue) {

        StringBuilder lcaToSrc = new StringBuilder();
        StringBuilder lcaToDest = new StringBuilder();

        findPath(root, startValue, lcaToSrc);
        findPath(root, destValue, lcaToDest);

        StringBuilder res = new StringBuilder();

        int index = 0;

        while(index < lcaToSrc.length() && index < lcaToDest.length() && lcaToSrc.charAt(index) == lcaToDest.charAt(index)){
            index++;
        }

        for(int i=0; i<lcaToSrc.length() - index; i++){
            res.append('U');
        }

        for (int i = index; i < lcaToDest.length(); i++) {
            res.append(lcaToDest.charAt(i));
        }

        return res.toString();
    }

    private boolean findPath(TreeNode root, int target, StringBuilder path){
        if(root == null){
            return false;
        }

        if(root.val == target){
            return true;
        }

        path.append('L');

        if(findPath(root.left, target, path) == true){
            return true;
        }

        path.deleteCharAt(path.length() - 1);

        path.append('R');

        if(findPath(root.right, target, path) == true){
            return true;
        }

        path.deleteCharAt(path.length() - 1);

        return false;
    }
}