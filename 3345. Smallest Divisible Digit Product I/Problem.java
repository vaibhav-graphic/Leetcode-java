class Problem {
    public int smallestNumber(int n, int t) {

        while(n < 101){
            int pro = 1;
            int run = n;
            
            while(run > 0){
                pro *= (run % 10);
                run /= 10;
            }
            // System.out.println(pro);

            if(pro % t == 0) return n;
            n++;
        }

        return 1;
    }
}