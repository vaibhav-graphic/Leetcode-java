class Problem {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n-1; i++){
            if(count > 1){
                sb.append('1');
                count--;
            }else{
                sb.append('0');
            }
        }

        sb.append('1');
        return sb.toString();
    }
}