class Problem {
    public String removeKdigits(String num, int k) {
        int n = num.length();

        if (n == k) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }

            if (!stack.isEmpty() || ch != '0') {
                stack.push(ch);
            }
        }

        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }

        if(stack.size() == 0){
            return "0";
        }

        StringBuilder sb = new StringBuilder("");

        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}