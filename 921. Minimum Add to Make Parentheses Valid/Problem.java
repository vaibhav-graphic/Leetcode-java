class Problem {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;

        for(char ch : s.toCharArray()){
            if(open > 0 && ch == ')'){
                open--;
            }
            else if(ch == '('){
                open++;
            }else{
                close++;
            }
        }

        return open + close;
    }
}