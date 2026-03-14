class Problem {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1; 
        long right = Arrays.stream(workerTimes).min().getAsInt() * (long) mountainHeight * (mountainHeight + 1) / 2;
        
        // Perform binary search
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canFinish(mountainHeight, workerTimes, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }

    private  boolean canFinish(int mountainHeight, int[] workerTimes, long maxTime) {
        long totalHeightReduced = 0;
        for (int time : workerTimes) {
            // Calculate how many units of mountain this worker can reduce within maxTime
            long heightReduced = 0;
            long currentTime = 0;
            int x = 1;
            
            while (currentTime + (long) time * x <= maxTime) {
                currentTime += (long) time * x;
                heightReduced++;
                x++;
            }
            
            totalHeightReduced += heightReduced;
            if (totalHeightReduced >= mountainHeight) {
                return true;
            }
        }
        
        return totalHeightReduced >= mountainHeight;
    }
}