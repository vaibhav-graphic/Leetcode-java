class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int val : nums){
            pq.offer((long) val);
        }

        int count = 0;
        while(!pq.isEmpty() && pq.size() > 1){
            long val1 = pq.poll();
            long val2 = pq.poll();

            if(k > val1 || k > val2){
                long cal = (long)Math.min(val1,val2) * 2 + (long)Math.max(val1,val2);
                pq.offer(cal);
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}