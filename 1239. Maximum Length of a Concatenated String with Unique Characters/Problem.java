class Problem {

    private boolean duplicate(String s1,String s2){
        int[] arr = new int[26];

        for(char ch : s1.toCharArray()){
            if(arr[ch - 'a'] > 0){
                return true;
            }

            arr[ ch - 'a' ]++;
        }

        for(char ch : s2.toCharArray()){
            if(arr[ch - 'a' ] > 0){
                return true;
            }
        }

        return false;
    }

    private int solve(int i,List<String> arr,String temp,int n){
        if(i >= n){
            return temp.length();
        }

        int include = 0;
        int exclude = 0;

        if(duplicate(arr.get(i),temp)){
            exclude = solve(i+1,arr,temp,n);
        }else{
            exclude = solve(i+1,arr,temp,n);

            include = solve(i+1,arr,temp + arr.get(i),n);
        }

        return Math.max(include,exclude);
    }
    public int maxLength(List<String> arr) {
        int n = arr.size();

        String temp = "";
        int i=0;
        return solve(i,arr,temp,n);
    }
}