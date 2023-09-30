import java.util.HashMap;

class Isomorphic{
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
 
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
 
            if(!map.containsKey(ch1)){
                if(map.containsValue(ch2)){
                    return false;
                }else{
                    map.put(ch1,ch2);
                }
            }else{
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }
        }
        return true;
     }
    public static void main(String [] args){
        String s="foo";
        String t="bar";
        System.out.print(isIsomorphic(s, t));
    }
}