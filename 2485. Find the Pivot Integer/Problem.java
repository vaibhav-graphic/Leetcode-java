class Problem {
    public int pivotInteger(int n) {

        if(n == 1){
            return 1;
        }

        int sum = ( n * ( n + 1 ) ) / 2;
        int low = 1;
        int high = n;

        // System.out.println(sum);

        while(low <= high){
            int mid = (low + high) /2 ;

            int cal1 = (mid * (mid + 1)) /2 ;
            int cal2 = sum  - cal1 + mid;

            // System.out.println(cal1 + " " + cal2);

            if(cal1 == cal2){
                return mid;
            }
            else if(cal1 < cal2){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}