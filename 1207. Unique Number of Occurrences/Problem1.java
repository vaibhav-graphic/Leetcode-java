class Problem1 {
    public boolean uniqueOccurrences(int[] arr) { 

        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(set.contains(val)){
                return false;
            }else{
                set.add(val);
            }
        }
        
        return true;
    }
}