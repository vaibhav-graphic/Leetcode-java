class Problem {
    public boolean areSentencesSimilar(String s1, String s2) {
      if(s1.length() < s2.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = m - 1;
        int l = 0;
        int r = n - 1;

        while(i < m && l < n && arr1[i].equals(arr2[l])){
            i++;
            l++;
        }

        while(r >= l && arr1[j].equals(arr2[r])){
            j--;
            r--;
        }

        if(l > r){
            return true;
        }
        return false;
    }
}