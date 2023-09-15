class FindtheHighestAltitude{
    public static int largestAltitude(int[] gain) {
        int maxAl=0;
        int currentAl=0;

       for(int g:gain){
           currentAl+=g;
           maxAl=Math.max(currentAl,maxAl);
       }
       return maxAl;
    }

    public static void main(String [] args){
        int[] arr={-5,1,5,0,-7};

        System.out.println(largestAltitude(arr));
    }
}