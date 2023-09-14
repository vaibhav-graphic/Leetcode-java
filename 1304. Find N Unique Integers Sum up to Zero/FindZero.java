import java.util.Arrays;

class FindZero{

    private static int[] sumZero(int n){
        int[] arr=new int[n];

        for(int i=1;i<=n/2;i++){
            arr[i-1]=i;
            arr[n-i]=-i;
        }
        return arr;
    }
    public static void main(String [] args){
        int n=5;

        System.out.print(Arrays.toString(sumZero(n)));
    }
}