class Problem {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] direction = {
                { 0, 1 },  //EAST
                { 1, 0 },  //SOUTH
                { 0, -1 }, //WEST
                { -1, 0 }  //NORTH
        };

        int step = 0;
        int dir = 0;

        ArrayList<int[]> result = new ArrayList<>();

        result.add(new int[]{rStart,cStart});

        while(result.size() < rows * cols){
            if(dir == 0 || dir == 2){ // east and west
                step++;
            }

            for(int count = 0; count < step; count++){
                rStart += direction[dir][0];
                cStart += direction[dir][1];

                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    result.add(new int[]{rStart,cStart});
                }
            }

            dir = (dir + 1) % 4;
        }

        int[][] converted = result.toArray(new int[result.size()][]);
        return converted;
    }
}