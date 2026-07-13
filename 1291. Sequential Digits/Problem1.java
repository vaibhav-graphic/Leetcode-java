class Problem {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> res = new ArrayList<>();

        for(int len=2; len<=s.length(); len++){
            for(int i=0; i<=s.length()-len; i++){
                String str = s.substring(i,len+i);
                int data = Integer.parseInt(str);

                if(data >= low && data <= high){
                    res.add(data);
                }
            }
        }
        return res;
    }
}