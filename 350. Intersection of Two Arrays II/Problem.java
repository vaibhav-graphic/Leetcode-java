class Problem {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i < m && j < n){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int[] res = new int[list.size()];

        for(i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}