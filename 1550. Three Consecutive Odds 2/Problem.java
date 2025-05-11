class Probl {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
                int count = 1;
                for(int j=i+1; j<n; j++){
                    if(arr[j] % 2 != 0){
                        count++;
                    }else if(count >= 3){
                        break;
                    }
                    else{
                        break;
                    }
                }
                System.out.println(count);
                if(count == 3) return true;
            }
        }
        return false;
    }
}