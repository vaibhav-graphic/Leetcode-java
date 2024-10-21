class Problem {
    public int maxUniqueSplit(String s) {
        HashSet<String> set = new HashSet<>();
        int n = s.length();
        int[] maxCount = {0};
        int currCount = 0;

        solve(s, 0, maxCount, currCount, set);
        
        return maxCount[0];
    }

    private void solve(String s, int i, int[] maxCount, int currCount, HashSet<String> set){
        if(i >= s.length()){
            maxCount[0] = Math.max(maxCount[0], currCount);
            return;
        }

        for(int j=i; j < s.length(); j++){
            String str = s.substring(i, j+1);

            if(!set.contains(str)){
                set.add(str);
                solve(s, j + 1, maxCount, currCount + 1, set);
                set.remove(str);
            }
        }
    }
}