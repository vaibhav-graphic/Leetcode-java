class Check_If_Two_String_Arrays_are_Equivalent{
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder sb1=new StringBuilder("");
        StringBuilder sb2=new StringBuilder("");

        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }

        for(int i=0;i<word2.length;i++){
            sb2.append(word2[i]);
        }
        
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }

         return false;   
    }
    public static void main(String [] args){
        String [] arr1={"ab","c"};
        String[] arr2={"a","bc"};

        System.out.println(arrayStringsAreEqual(arr1, arr2));
    }
}