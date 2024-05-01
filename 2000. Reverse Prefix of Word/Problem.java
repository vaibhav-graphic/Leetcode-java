class Problem {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int index = 0;

        for(int i=0; i<n; i++){
            char ch1 = word.charAt(i);

            if(ch1 == ch){
                index = i;
                break;
            }
        }
        String str = reverse(word.substring(0,index+1));
        StringBuilder sb = new StringBuilder(str);

        for(int i=index+1; i<n; i++){
            sb.append(word.charAt(i));
        }

        return sb.toString();

    }

    private String reverse(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=str.length() - 1 ; i>=0; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}