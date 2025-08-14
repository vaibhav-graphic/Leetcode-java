class Problem {
    public String largestGoodInteger(String num) {
        int n = num.length();
        int result = -1;

        for(int i=2; i<n; i++){
            if(num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i-2)){
                result = Math.max(result,num.charAt(i) - '0');
            }
        }

        if(result == -1){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<3; i++){
            sb.append((char)(48+result));
        }
        return sb.toString();
    }
}