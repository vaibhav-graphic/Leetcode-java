class Problem2 {
    public int numSteps(String s) {
        int n = s.length();

        if(n == 1) return 0;
        if(n == 2 && s.charAt(n-1) == '0') return 1;

        int count = 0;
        while(n >= 1){
            if(s.charAt(n-1) == '1'){
                s = convertOdd(s);
                count++;
            }else{
                s = convertEven(s);
                count++;
            }
            n = s.length();
        }

        return count;
    }

    private String convertOdd(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == '1'){
                sb.setCharAt(i,'0');
            }else{
                sb.setCharAt(i,'1');
                break;
            }
        }
        return sb.toString();
    }

    private String convertEven(String s){
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n-1; i++){
            sb.append(s.charAt(i));
        } 
        return sb.toString();
    }
}