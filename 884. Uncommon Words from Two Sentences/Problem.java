class Problem {
    private void fillHashMap(String s1, HashMap<String, Integer> hm){
        int n = s1.length();

        int i = 0;
        int j = 0;

        while(j < n){

            while(j < n && s1.charAt(j) != ' '){
                j++;
            }

            String str = s1.substring(i, j);

            i = j + 1;
            j++;
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> temp = new ArrayList<>();

        fillHashMap(s1, hm);
        fillHashMap(s2, hm);

        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            int count = entry.getValue();

            if(count == 1){
                temp.add( entry.getKey());
            }
        }

        String[] res = temp.toArray(new String[0]);

        return res;
    }
}