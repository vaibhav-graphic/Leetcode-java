class Problem {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        
        for(int val : apple){
            sum += val;
        }
        
        Arrays.sort(capacity);
        int count = 0;
        int m = capacity.length;
        
        for(int i=m-1; i>=0; i--){
            if(sum >= capacity[i]){
                count++;
                sum -= capacity[i];
            }else{
                break;
            }
        }
        
        if(sum > 0){
            count++;
        }
        
        return count;
    }
}