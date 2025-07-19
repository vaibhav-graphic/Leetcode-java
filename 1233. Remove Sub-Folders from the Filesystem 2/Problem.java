class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res = new ArrayList<>();
        Arrays.sort(folder);

        res.add(folder[0]);
        
        for(int i=1; i<folder.length; i++){
            String curr = folder[i];
            String prev = res.get(res.size() - 1);
            prev += '/';

            if(check(curr, prev) == false){
                res.add(curr);
            }
        }

        return res;
    }

    private boolean check(String curr, String prev){
        int n = prev.length();

        for(int i=0; i<n; i++){
            if(prev.charAt(i) != curr.charAt(i)){
                return false;
            }
        }

        return true;
    }
}