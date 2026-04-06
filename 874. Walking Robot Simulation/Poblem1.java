class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();

        for(int[] obs : obstacles){
            set.add( obs[0] + "-" + obs[1]);
        }

        int x = 0;
        int y = 0;
        int maxD = 0;

        int[] direction = {0,1};

        for(int comm : commands){
            if(comm == -1){
                direction = new int[]{direction[1] , -direction[0]};
            }else if(comm == -2){
                direction = new int[]{-direction[1] , direction[0]};
            }else{
                for(int step = 0; step < comm; step++){
                    int newX = x + direction[0];
                    int newY = y + direction[1];
                    
                    String key = newX + "-" + newY;

                    if(set.contains(key)){
                        break;
                    }

                    x = newX;
                    y = newY;
                }

                maxD = Math.max(maxD, x * x + y * y);
            }
        }
        return maxD;
    }
}