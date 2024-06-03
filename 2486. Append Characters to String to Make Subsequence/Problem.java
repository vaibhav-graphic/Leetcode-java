class Problem {
    public int appendCharacters(String s, String t) {
        int n = s.length();
        int m = t.length();

        int i=0 , j=0 , count=0;

        while(i < n && j < m){
            char sch = s.charAt(i);
            char tch = t.charAt(j);

            if(sch == tch){
                i++;
                j++;
            }
            else if(sch != tch){
                i++;
            }
        }

        if(j < m){
            count += m - j;
        }
        return count;
    }
}