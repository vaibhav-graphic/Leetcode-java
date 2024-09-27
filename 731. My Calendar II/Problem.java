class Problem {

    List<int[]> doubleBooking;
    List<int[]> booking;

    public Problem() {
        doubleBooking = new ArrayList<>();
        booking = new ArrayList<>();    
    }
    
    public boolean book(int start, int end) {
        
        for(int[] arr : doubleBooking){
            if(checkBooking(start, end, arr[0], arr[1])){
                return false;
            }
        }

        for(int[] arr : booking){
            if(checkBooking(start, end, arr[0], arr[1])){
                int[] overlapPart = getOverlaping(start, end, arr[0], arr[1]);
                doubleBooking.add( overlapPart );
            }
        }

        booking.add(new int[]{start,end});
        return true;
    }

    private boolean checkBooking(int start1, int end1, int start2, int end2){
        return Math.max(start1, start2) < Math.min(end1, end2);
    }

    private int[] getOverlaping(int start1, int end1, int start2, int end2){
        int[] arr = {Math.max(start1, start2), Math.min(end1, end2)};
        return arr;
    }
}