class Problem {
    TreeSet<int[]> set;

    public Problem() {
        set = new TreeSet<>( (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);    
    }
    
    public boolean book(int start, int end) {
        int[] event = new int[]{start, end};
        int[] next = set.ceiling(event);

        if(next != null && next[0] < end){
            return false;
        }

        int[] prev = set.floor(event);

        if(prev != null && start < prev[1]){
            return false;
        }

        set.add(event);
        return true;
    }
}