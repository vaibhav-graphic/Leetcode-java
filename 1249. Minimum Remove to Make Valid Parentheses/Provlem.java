class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push( i );
            }
            else if(ch == ')'){
                if(stack.isEmpty()){
                    set.add(i);
                }else{
                    stack.pop();
                }
            }
        }

        // test case "((((" then 

        while(!stack.isEmpty()){
            set.add( stack.pop() );
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            if(set.contains(i)){
                continue;
            }else{
                sb.append( s.charAt(i) );
            }
        }

        return sb.toString();
    }
}