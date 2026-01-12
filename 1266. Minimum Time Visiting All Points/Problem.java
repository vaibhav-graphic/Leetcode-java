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
        
		// returns bigger distance
		// if x = 5 and y = 3, we need to take 3 diagonal steps and 2 horizontal/vertical steps
		// = 5 total steps, so we can just return bigger
        return bigger;
    }
}