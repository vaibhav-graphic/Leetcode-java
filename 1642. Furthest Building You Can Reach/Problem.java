class Problem {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        int i = 0;

        for( ; i<n-1; i++){

            if(heights[i] >= heights[i+1]){
                continue;
            }

            int diff = heights[i+1] - heights[i];

            if(bricks >= diff){
                bricks -= diff;
                q.offer(bricks);
            }
            else if(ladders > 0){

                if(!q.isEmpty()){
                    int pastBricks = q.peek();

                    if(pastBricks > diff){
                        bricks += pastBricks;
                        q.poll();
                        bricks -= diff;
                        q.offer(bricks);
                    }
                }
                ladders--;
            }else{
                break;
            }
        }
        return i;
    }
}