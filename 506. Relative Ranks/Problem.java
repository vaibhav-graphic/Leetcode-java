class Athlete implements Comparable<Athlete>{
    int index;
    int score;

    public Athlete(int index,int score){
        this.index = index;
        this.score = score;
    }

    @Override
    public int compareTo(Athlete other) {
        return Integer.compare(this.score, other.score);
    }
}

class Problem {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Athlete> pq = new PriorityQueue<Athlete>( Collections.reverseOrder());
        int n = score.length;

        for(int i=0; i<n; i++){
            pq.add(new Athlete(i,score[i]));
        }

        String[] res = new String[n];
        int count = 0;

        while(!pq.isEmpty()){
            Athlete athlete = pq.poll();
            int index = athlete.index;
            int score1 = athlete.score;

            if(count == 0) res[index] = "Gold Medal";
            else if(count == 1) res[index] = "Silver Medal";
            else if(count == 2) res[index] = "Bronze Medal";
            else res[index] = Integer.toString(count+1);
            count++;
        }

        return res;
    }
}