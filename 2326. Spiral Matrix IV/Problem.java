class Problem {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];

        for(int[] arr : res){
            Arrays.fill(arr,-1);
        }

        int l = 0;
        int r = n - 1;
        int t = 0;
        int b = m - 1;

        ListNode temp = head;

        while(l <= r && t <= b && temp != null){

            for(int col = l; col <= r && temp != null ; col++){
                res[t][col] = temp.val;
                temp = temp.next;
            }
            t++;

            for(int row = t; row <= b &&  temp != null; row++){
                res[row][r] = temp.val;
                temp = temp.next;
            }
            r--;

            for(int col = r; col >= l && temp != null; col--){
                res[b][col] = temp.val;
                temp = temp.next;
            }
            b--;

            for(int row = b; row >= t && temp != null; row--){
                res[row][l] = temp.val;
                temp = temp.next;
            }
            l++;
        }
        return res;
    }
}