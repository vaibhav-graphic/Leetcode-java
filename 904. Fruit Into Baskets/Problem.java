class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        int start = 0;
        int max = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int end = 0; end < n; end++) {
            hm.put(arr[end], hm.getOrDefault(arr[end], 0) + 1);

            while (hm.size() > 2) {
                int remove = hm.get(arr[start]);

                if (remove == 1) {
                    hm.remove(arr[start]);
                } else {
                    hm.put(arr[start], remove - 1);
                }
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}