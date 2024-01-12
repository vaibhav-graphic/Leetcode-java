class Problem {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int i = 0,j = n/2;
        int count1 = 0,count2 = 0;
        while(j < n){
            if(check(s.charAt(i))){
                count1++;
            }
            if(check(s.charAt(j))){
                count2++;
            }
            i++;
            j++;
        }

        if(count1 == count2){
            return true;
        }

        return false;
    }
    private boolean check(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
         ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
            return true;
        }
        return false;
    }
}