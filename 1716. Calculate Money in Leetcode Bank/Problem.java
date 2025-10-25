class Solution {
    public int totalMoney(int n) {
        
        int term = n/7;

        int first = 28;
        int last = 28 + (term - 1) * 7;

        int result = term * (first + last ) / 2;

        int start = 1 + term;


        for(int days=1; days<=n%7; days++){
            result += start;
            start++;
        }
        return result;
    }
}