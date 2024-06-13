class Problem {
    public int minMovesToSeat(int[] seats, int[] students) {
       Arrays.sort(seats);
       Arrays.sort(students);
       int count = 0;

       for(int i=0; i<students.length; i++){
            if(seats[i] > students[i]){
                count += seats[i] - students[i];
            } 
            else if(seats[i] < students[i]){
                count += students[i] - seats[i];
            }
       }
        return count;
    }
}