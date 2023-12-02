import java.util.Scanner;

class Approch_3 {
    public int trap(int[] height) {
        int n = height.length;

        int left=0, right = n-1;
        int left_max = 0, right_max = 0;
        int result = 0;

        while(left <=  right){

            if(height[left] <= height[right]){
               
               if(height[left] > left_max){
                   left_max = height[left];
               }else{
                   result += left_max - height[left];
               }

               left++;
            }else{

                if(height[right] > right_max){
                    right_max = height[right];
                }else{
                    result += right_max - height[right];
                }

                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Approch_3 solution = new Approch_3();
        int result = solution.trap(arr);

        System.out.println("The amount of water that can be trapped is: " + result);
    }

}