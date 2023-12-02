public class Approch_1 {

        public int countCharacters(String[] words, String chars) {
            
            int[] charFreq = new int[26];
            int length = 0;
    
            for(char ch : chars.toCharArray()){
                charFreq[ch - 'a']++;
            }
    
            for(String word : words){
    
                int[] wordFreq = new int[26];
    
                for(char ch : word.toCharArray()){
                    wordFreq[ch - 'a']++;
                }
    
                boolean ok = true;
                for(int i = 0; i < 26; i++){
                    if(wordFreq[i] > charFreq[i]){
                        ok = false;
                        break;
                    }
                }
    
                if(ok){
                    length += word.length();
                }
            }
            return length;
        }   
    
        public static void main(String[] args) {
            Approch_1 solution = new Approch_1();
    
            // Example usage:
            String[] words = {"cat", "bt", "hat", "tree"};
            String chars = "atach";
    
            int result = solution.countCharacters(words, chars);
    
            System.out.println("Total length of words that can be formed: " + result);
        }
}