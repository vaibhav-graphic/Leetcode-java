public class Approch_1 {
    public static int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + low;
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        int k = 4;
        int ans = findKthPositive(arr, k);
        System.out.println("The missing number is: " + ans);
    }
}
