class Problem {
    public long maxKelements(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(long num : nums){ 
            pq.offer(num);
        }

        long score = 0;

        while(k > 0 && !pq.isEmpty()){
            long data = pq.poll();
            score += data;
            data = data % 3 == 0 ? data / 3 : (data / 3 ) + 1;
            pq.offer( (long)data );
            k--;
        }

        return score;
    }
}