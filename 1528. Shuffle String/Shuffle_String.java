class Shuffle_String{
    public static String restoreString(String s, int[] indices) {
        char c[]=new char[s.length()];

        for(int i=0;i<s.length();i++){
            c[indices[i]]=s.charAt(i);
        }
        return String.valueOf(c);
    }

    public static void main(String [] args){
        String s="codeleet";
        int[] arr={4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,arr));
    }
}