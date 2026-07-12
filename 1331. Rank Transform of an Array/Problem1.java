class Problem {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] rank = arr.clone();
        Arrays.sort(rank);
        int count = 1;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int val : rank){
            if(!hm.containsKey(val)){
                hm.put(val, count++);
            }
        }

        for(int i=0; i<n; i++){
            arr[i] = hm.get(arr[i]);
        }

        return arr;
    }
}