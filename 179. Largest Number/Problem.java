class Problem {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        String[] stringArr = new String[n];

        for (int i = 0; i < n; i++) {
            stringArr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(stringArr, (a, b) -> (b + a).compareTo(a + b));

        if (stringArr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String num : stringArr) {
            sb.append(num);
        }

        return sb.toString();
    }
}