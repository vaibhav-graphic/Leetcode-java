class Solution {
    public int findNumbers(int[] nums) {
        int even=0,odd=0;
       for(int num:nums){
           if(0<num&&num<9 || 100<=num&&num<=999 || 10000<=num&&num<=99999){
                odd++;
           }else{
               even++;
           }
       }
       return even;
    }
}