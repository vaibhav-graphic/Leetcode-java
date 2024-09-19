class Problem {
    public List<Integer> diffWaysToCompute(String s) {
        return solve(s);
    }

    private List<Integer> solve(String s){
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*'){
                List<Integer> leftPart = solve(s.substring(0, i));
                List<Integer> rightPart = solve(s.substring(i + 1));

                for(int x : leftPart){
                    for(int y : rightPart){
                        if(ch == '+'){
                            res.add(x + y);
                        }
                        else if(ch == '-'){
                            res.add(x - y);
                        }
                        else if(ch == '*'){
                            res.add(x * y);
                        }
                    }
                }
            }
        }

        if(res.size() == 0){
            res.add( Integer.parseInt( s.substring(0)));
        }

        return res;
    }
}