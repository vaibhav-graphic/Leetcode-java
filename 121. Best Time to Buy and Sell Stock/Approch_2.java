public class Approch_2 {
    public static int maxProfit(int[] prices) {
        int max=0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    max=Math.max(prices[j]-prices[i],max);
                }
            }
        }
        return max;
     }
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4};

        System.out.print(maxProfit(arr));
    }
}
