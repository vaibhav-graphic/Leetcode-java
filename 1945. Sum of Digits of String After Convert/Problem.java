class Problem {
    public int getLucky(String s, int k) {
        String str = "";

        for(char ch : s.toCharArray()){
            str += ch - 96;
        }

        long ans = 0;
        String str2 = "";

        while(k-- > 0){
            long temp1 = 0;

            for(char ch : str.toCharArray()){
                temp1 += Character.getNumericValue(ch);
                str2 += ch;
            }

            ans = temp1;
            str = Long.toString(temp1);
        }
        return (int)ans;
    }
}