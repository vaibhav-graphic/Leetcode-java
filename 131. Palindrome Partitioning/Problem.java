class Problem {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();

        generate(s,0,res,new ArrayList<>());

        return res;
    }

    private void generate(String str,int index,List<List<String>> res,List<String> temp){
        if(index == str.length()){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index; i<str.length(); i++){
            if(isPalin(str,index,i)){
                temp.add(str.substring(index,i+1));
                generate(str,i+1,res,temp);
                temp.remove(temp.size()-1);
            }            
        }
    }

    private boolean isPalin(String str,int left,int right){
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}