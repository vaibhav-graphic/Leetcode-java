class Approch_1{

    public static int maxProduct(int[] arr){
        int n=arr.length;
        int prefix=1;
        int suffix=1;
        int res=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix*=arr[i];
            suffix*=arr[n-i-1];

            res=Math.max(res,Math.max(prefix,suffix));
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={2,3,-2,4};

        System.out.println(maxProduct(arr));
    }
}