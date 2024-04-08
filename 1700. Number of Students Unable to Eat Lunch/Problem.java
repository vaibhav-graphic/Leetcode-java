class Problem {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;

        int oCount = 0;
        int zCount = 0;

        for(int val : students){
            if(val == 1) oCount++;
            else zCount++;
        }

        for(int i=0; i<n; i++){
            if(sandwiches[i] == 1){
                if(oCount > 0) oCount--;
                else return n - i;
            }else{
                if(zCount > 0) zCount--;
                else return n - i;
            }
        }

        return  0;
    }
}