class Problem {

    private boolean isPal(String str){
        int i = 0;
        int j = str.length()-1;

        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n = words.length;

        for(String str : words){
            if(isPal(str)){
                return str;
            }
        }
        return "";
    }
}