class Problem {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long total = 0;

        for(int val : chalk){
            total += val;
        }

        int remain = (int)(k % total);

        for(int i=0; i<n; i++){
            if(remain < chalk[i]){
                return i;
            }
            remain -= chalk[i];
        }

        return 0;
    }
}