class Problem {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] arr : intervals){
            int s = arr[0];
            int e = arr[1];

            if(!pq.isEmpty() && s > pq.peek()){
                pq.poll();
            }

            pq.offer(e);
        }

        return pq.size();
    }
}