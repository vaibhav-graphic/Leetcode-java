class Problem {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int  index = 0;

        int[] freq = new int[1001];

        for(int val : arr1){
            freq[ val ]++;
        }

        for(int i=0; i<arr2.length; i++){
            int run = freq[ arr2[i] ];

            while(run > 0){
                arr1[index++] = arr2[i];
                freq[ arr2[i] ]--;
                run--;
            }
        }

        for(int i=0; i<1001; i++){
            if(freq[i] > 0){
                int run = freq[i];

                while(run > 0){
                    arr1[index++] = i;
                    run--;
                }
            }
        }
        return arr1;
    }
}