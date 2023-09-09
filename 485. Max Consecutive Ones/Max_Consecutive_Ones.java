import java.util.Scanner;

class Max_Consecutive_Ones{

    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,check=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>check){
                    check=count;
                }
            }else{
                count=0;
            }
        }
        return check;
    }
    public static void main(String [] args){
        Max_Consecutive_Ones obj=new Max_Consecutive_Ones();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array -> ");
        int size=sc.nextInt();
        int []arr=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int res=obj.findMaxConsecutiveOnes(arr);
        System.out.print(res);
        sc.close();
    }
}