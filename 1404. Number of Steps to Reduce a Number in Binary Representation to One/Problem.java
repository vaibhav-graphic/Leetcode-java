class Solution {
    public int numSteps(String s) {
        int n = s.length();
        int count = 0;
        int carry = 0;

        for(int i=n-1; i>=1; i--){
            if(((s.charAt(i) - '0') + carry ) % 2 == 1){
                count +=2;
                carry = 1;
            }else{
                count += 1;
            }
        }

        return count + carry;
    }
}