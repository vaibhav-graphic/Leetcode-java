class Problem {
    public List<List<Integer>> findWinners(int[][] matches) {

        int[] count = new int[100001];
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<matches.length; i++){
            int win = matches[i][0];
            int loss = matches[i][1];

            if(count[win] == 0){
                count[win] = -1;
            }

            if(count[loss] == -1){
                count[loss] = 1;
            }else{
                count[loss]++;
            }
        }

        List<Integer> winner = new ArrayList<>();
        List<Integer> loser = new ArrayList<>();

        for(int i=0; i<count.length; i++){
            if(count[i] == -1){
                winner.add(i);
            }
            else if(count[i] == 1){
                loser.add(i);
            }
        }

        res.add(winner);
        res.add(loser);

        return res;
    }
}