class Problem {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int n = arr.length;

        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
        }

        int total = hs.size();

        int[] freq = new int[n+1];

        for(Map.Entry<Integer,Integer> val : hs.entrySet()){
            int value = val.getValue();
            freq[ value ]++;
        }

        for(int i=1; i<freq.length; i++){
            int type = Math.min((k/i),freq[i]);

            k -= (type * i);

            total -= type;

            if(k <= i){
                return total;
            }
        }
        return 0;
    }
}