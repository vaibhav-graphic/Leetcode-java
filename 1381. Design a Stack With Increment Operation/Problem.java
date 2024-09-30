class CustomStack {

    private int[] arr;
    private int index;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        index = -1;
    }

    public void push(int x) {
        if (index >= arr.length - 1) {
            return;
        }
        index++;
        arr[index] = x;
    }

    public int pop() {
        if (index == -1) {
            return -1;
        }

        int ans = arr[index];
        index--;
        return ans;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, arr.length); i++) {
            arr[i] = arr[i] + val;
        }
    }
}