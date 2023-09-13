class Find_Pivot_Index {

    private static int pivotIndex(int[] arr) {
        int total = 0;
        int left = 0;

        for (int i = 0; i < arr.length; i++)
            total += arr[i];

        for (int i = 0; i < arr.length; i++) {
            if (left == total - left - arr[i])
                return i;

            left += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };

        System.out.print(pivotIndex(arr));
    }
}