import java.util.Scanner;

public class Approch_2 {

    public int trap(int[] arr) {
        int n = arr.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            prefix[i] = max;
        }

        max = 0;

        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            suffix[i] = max;
        }

        int water = 0;

        for (int i = 0; i < n; i++) {
            water += Math.min(prefix[i], suffix[i]) - arr[i];
        }
        return water;
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

        Approch_2 solution = new Approch_2();
        int result = solution.trap(arr);

        System.out.println("The amount of water that can be trapped is: " + result);
    }
}
