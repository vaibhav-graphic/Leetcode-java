class Problem {
    public int candy(int[] arr) {
        int n = arr.length;
        int sum = 1;
        int i = 1;

        while(i < n){
            if(arr[i] == arr[i-1]){
                sum++;
                i++;
                continue;
            }

            int peek = 1;

            while(i < n && arr[i] > arr[i-1]){
                peek++;
                i++;
                sum += peek;
            }

            int down = 0;

            while(i < n && arr[i] < arr[i-1]){
                down++;
                sum += down;
                i++;
            }
            down++;
            if(down > peek){
                sum += (down - peek);
            }
        }
        return sum;
    }
}