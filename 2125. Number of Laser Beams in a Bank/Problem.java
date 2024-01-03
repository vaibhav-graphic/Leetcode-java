class Problem {
    public int numberOfBeams(String[] bank) {

        int prev = 0;
        int res = 0;

        for(String s : bank){
            int curr = 0;
            char arr[] = s.toCharArray();

            for(int i=0; i<arr.length; i++){
                if(arr[i] == '1'){
                    curr++;
                }
            }
            res += prev * curr;

            if(curr != 0){
                prev = curr;
            }
        }
        return res;
    }
}