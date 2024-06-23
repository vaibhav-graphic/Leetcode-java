class Problem {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>( (a,b) -> b[0] - a[0] );
        PriorityQueue<int[]> minHeap = new PriorityQueue<>( (a,b) -> a[0] - b[0] );

        int l = 0;
        int maxLen = 0;

        for(int r=0; r<n; r++){
            maxHeap.offer(new int[]{nums[r],r});
            minHeap.offer(new int[]{nums[r],r});

            int maxEle = maxHeap.peek()[0];
            int minEle = minHeap.peek()[0];

            int maxInd = maxHeap.peek()[1];
            int minInd = minHeap.peek()[1];

            int totLim = maxEle - minEle;

            if(totLim <= limit){
                maxLen = Math.max(maxLen,r - l + 1);
            }
            else{
                l = Math.min(maxInd,minInd) + 1;

                while(maxHeap.peek()[1] < l){
                    maxHeap.poll();
                }

                while(minHeap.peek()[1] < l){
                    minHeap.poll();
                }
            }
        }
        return maxLen;
    }
}