class Problem {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(!st.isEmpty()){
                if(ch == ')' && st.peek() != '('){
                    return false;
                }
                else if(ch == '}' && st.peek() != '{'){
                    return false;
                }
                else if(ch == ']' && st.peek() != '['){
                    return false;
                }
                st.pop();
            }else {
                return false;
            }
        }

        if(st.isEmpty()){
            return true;
        }

        return false;
    }
}