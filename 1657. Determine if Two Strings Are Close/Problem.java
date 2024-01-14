class Problem {
    public boolean closeStrings(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        if(m != n){
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0; i<m; i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            int index1 = ch1 - 'a';
            int index2 = ch2 - 'a';

            arr1[index1]++;
            arr2[index2]++; 
        }

        for(int i=0;i<26;i++){
            if(arr1[i] != 0 && arr2[i] !=0){
                continue;
            }
            if(arr1[i] == 0 && arr2[i] == 0){
                continue;
            }

            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}