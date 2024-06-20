class Problem {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);

        int min = 1;
        int max = position[n-1] - position[0];
        
        int res = 0; 

        while(min <= max){
            int mid = min + (max - min) / 2;

            if(possible(position,m,mid,n)){
                res = mid;
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }

        return res;
    }

    private boolean possible(int[] arr,int m,int force,int n){
        int prev = arr[0];
        int balls = 1;

        for(int i=1; i<n; i++){
            int curr = arr[i];

            if(curr - prev >= force){
                balls++;
                prev = curr;
            }

            if(balls == m){
                return true;
            }
        }
        return false;
    }
}