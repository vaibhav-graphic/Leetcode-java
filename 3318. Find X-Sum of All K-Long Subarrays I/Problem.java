class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<k; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        ans[0] = cal(hm, x);

        int l = 0;
        for(int i=k; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            hm.put(nums[l], hm.getOrDefault(nums[l], 0) - 1);
            l++;

            if(hm.get(nums[l]) == 0){
                hm.remove(nums[l]);
            }

            ans[i - k + 1] = cal(hm, x);
        }

        return ans;
    }

    private int cal(HashMap<Integer,Integer> hm, int x){
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] != b[1] ? Integer.compare(b[1], a[1]) : Integer.compare(b[0], a[0])
        );

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        int sum = 0;
        int count = 0;

        while(!pq.isEmpty() && count < x){
            int[] top = pq.poll();
            sum += top[0] * top[1];
            count++;
        }

        return sum;
    }
}