class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        int n = tri.size();
        int m = tri.get(n - 1).size();

        int[] prev = new int[n];
        int[] temp = new int[n];

        for(int col = 0; col < m; col++){
            prev[col] = tri.get(n - 1).get(col);
        }

        for(int row = n - 2; row >= 0; row--){
            for(int col = row; col >= 0; col--){
                int down = prev[col];
                int dia = prev[col + 1];

                temp[col] = tri.get(row).get(col) + Math.min(down, dia);
            }
            prev = temp.clone();
        }

        return prev[0];
    }
}