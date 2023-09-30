import java.util.HashMap;

class WordPattern{
    public static boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");

        if(pattern.length()!=words.length)
            return false;

        HashMap<Character,String> map=new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char ch1=pattern.charAt(i);
            String word=words[i];

            if(!map.containsKey(ch1)){
                if(map.containsValue(word)){
                    return false;
                }else{
                    map.put(ch1,word);
                }
            }else{
                if(!map.get(ch1).equals(words[i])){
                    return false;
                }
            }
        }
        return true;
    }   

    public static void main(String [] args){
        String pattern="abba";
        String s="dog cat cat dog";

        System.out.print(wordPattern(pattern,s));
    }
}