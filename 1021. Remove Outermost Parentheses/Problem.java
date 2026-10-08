class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(open > 0){
                    sb.append(ch);
                }
                open++;
            }else{
                if(open > 1){
                    sb.append(ch);
                }
                open--;
            }
        }
        return sb.toString();
    }
}