class Problem {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        int n = arr.length;

        if(n == 1){
            String str = arr[0];

            if(str.charAt(0) == str.charAt(str.length() - 1)){
                return true;
            }
            return false;
        }

        String first = arr[0];
        String last = arr[n - 1];

        if(first.charAt(0) != last.charAt(last.length() - 1)){
            return false;
        }

        for(int i=1; i<n; i++){
            first = arr[i - 1];
            String second = arr[i];

            if(first.charAt(first.length() - 1) != second.charAt(0)){
                return false;
            }
        }

        return true;
    }
}