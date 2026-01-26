class Pr {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list1=new ArrayList<>();
        Arrays.sort(arr);

        int min=Integer.MAX_VALUE,diff;

        for(int i=0;i<arr.length-1;i++){
            diff=arr[i+1]-arr[i];

            if(diff<min){
                min=diff;
                list1.clear();
                list1.add(Arrays.asList(arr[i],arr[i+1]));
            }else if(diff==min){
                list1.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list1;
    }
}