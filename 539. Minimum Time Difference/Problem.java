class Problem {
    public int findMinDifference(List<String> timePoints) {
        int size = timePoints.size();
        int totalTimeInDay = 24 * 60;

        int[] minutesArray = new int[size];

        for(int i=0; i<size; i++){
            String str = timePoints.get(i);

            int hours = Integer.parseInt( str.substring(0,2) ) * 60;
            int minutes = Integer.parseInt( str.substring(3,5) );

            int totalMinutes = hours + minutes;

            minutesArray[i] = totalMinutes;
        }

        Arrays.sort( minutesArray );

        int minimumMinutes = Integer.MAX_VALUE;

        for(int i=1; i<size; i++){
            int diff = minutesArray[i] - minutesArray[ i - 1 ];

            minimumMinutes = Math.min( minimumMinutes, diff);
        }

        int remain = (totalTimeInDay - minutesArray[ size - 1 ] ) + minutesArray[0];

        minimumMinutes = Math.min( minimumMinutes, remain);

        return minimumMinutes;
    }
}