class Problem {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for(int val : nums1){
            hs.add(val);
        }

        for(int val : nums2){
            if(hs.contains(val)){
                temp.add(val);
                hs.remove(val);
            }
        }

        int[] res = new int[ temp.size() ];
        for(int i=0; i<temp.size(); i++){
            res[i] = temp.get(i);
        }

        return res;
    }
}