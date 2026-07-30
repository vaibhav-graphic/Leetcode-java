class Solution {
    public int minimumPushes(String word) {
        Map<Integer,Integer> hs = new HashMap<>();
        int check = 2;
        int res = 0;

        for(char ch : word.toCharArray()){
            if(check > 9){
                check = 2;
            }

            hs.put(check,hs.getOrDefault(check,0) + 1);
            res += hs.get(check);
            check++;
        }

        return res;
    }
}