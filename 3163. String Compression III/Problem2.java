class Problem2 {
    public String compressedString(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(!st.isEmpty() && st.peek() != ch || st.size() == 9){
                sb.append(st.size());
                sb.append(st.peek());
                st.clear();
            }

            st.push(ch);
        }

        if(!st.isEmpty()){
            sb.append(st.size());
            sb.append(st.peek());
            st.clear();
        }

        return sb.toString();
    }
}