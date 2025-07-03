class Problem {
    public char kthCharacter(int k) {
        int size = 1;
        StringBuilder sb = new StringBuilder("a");

        while(size < k){
            StringBuilder sb1 = new StringBuilder();

            for(int i=0; i<sb.length(); i++){
                char ch = sb.charAt(i);
                if(ch == 'z'){
                    ch = 'a';
                }

                ch += 1;
                // System.out.println(ch + " ");
                
                sb1.append(ch);
            }
            // System.out.print(sb + " ");
            sb.append(sb1);
            size = sb.length();
        }

        // System.out.println(sb);

        return sb.charAt(k - 1);
    }
}