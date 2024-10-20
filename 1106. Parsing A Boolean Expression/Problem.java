class Problem {
    public boolean parseBoolExpr(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ','){
                continue;
            }
            else if(ch != ')'){
                st.push(ch);
            }else{
                ArrayList<Character> list = new ArrayList<>();

                while(!st.isEmpty() && st.peek() != '('){
                    list.add(st.pop());
                }
                st.pop();
                char ope = st.pop();
                

                char flag = solve(list, ope) == true ? 't' : 'f';
                st.push(flag);
            }
        }

        return st.pop() == 't' ? true : false;
    }

    private boolean solve(ArrayList<Character> list, char ope){
        if(ope == '&'){
            for(char ch : list){
                if(ch == 'f'){
                    return false;
                }
            }

            return true;
        }
        else if(ope == '|'){
            for(char ch : list){
                if(ch == 't'){
                    return true;
                }
            }
            return false;
        }
        else{
            return list.get(0) == 't' ? false : true;
        }
    }
}