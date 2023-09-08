import java.util.Scanner;

class Move_Zero{

    private void moveZeroes(int []nums){
        int i=0;
        for(int num:nums){
            if(num!=0){
                nums[i]=num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
    public static void main(String [] args){
        Move_Zero obj=new Move_Zero();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array ->");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        obj.moveZeroes(arr);

        for(int num:arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
}