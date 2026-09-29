class Problem {
    public int maxDepth(String s) {
        int n = s.length();

        int count = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                count++;
            }
            else if(s.charAt(i) == ')'){
                count--;
            }

            max = Math.max(max,count);
        }

        return max;

        // for(int i=0; i<n; i++){
        //     if(s.charAt(i) == '('){
        //         count++;
        //     }
            
        //     if(count == max){
        //         return s.charAt(i+1) - '0';
        //     }
        // }
        // return 0;
    }
}