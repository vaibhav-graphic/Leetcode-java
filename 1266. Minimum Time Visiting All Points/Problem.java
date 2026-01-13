class Problem {
    public int minTimeToVisitAllPoints(int[][] points) {
        int total = 0; 
        for(int i = 0; i < points.length-1; i++) {
            total+=distance(points[i], points[i+1]);
        }
        
        return total;
    }
	
    int distance(int[] p1, int[] p2) {
        int x = Math.abs(p1[0] - p2[0]);
        int y = Math.abs(p1[1]-p2[1]);
        
        int bigger = x > y ? x : y;
        
        return bigger;
    }
}