class Problem {

    private static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.print("enter the size of array ->");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        plusOne(arr);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}