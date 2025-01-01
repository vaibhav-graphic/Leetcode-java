class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int result = Integer.MIN_VALUE;
        int zero = 0;
        int one = 0;
        int total_one = 0;

        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == '1'){
                one++;
            }else{
                zero++;
            }

            result = Math.max(result, zero - one);
        }

        if(s.charAt(n-1) == '1'){
            one++;
        }

        return result + one;
    }
}