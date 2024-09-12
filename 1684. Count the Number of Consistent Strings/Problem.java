class Problem {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        Set<Character> set = new HashSet<>();

        for(int i=0; i<allowed.length(); i++){
            char ch = allowed.charAt(i);
            set.add(ch);
        }

        for(String str : words){
            boolean flag = true;

            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                if(!set.contains(ch)){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                count++;
            }
        }

        return count;
    }
}