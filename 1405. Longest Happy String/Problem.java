class Problem {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        
        if(a > 0){
            pq.offer(new int[]{a,'a'});
        }
        if(b > 0){
            pq.offer(new int[]{b,'b'});
        }
        if(c > 0){
            pq.offer(new int[]{c,'c'});
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int freq = curr[0];
            char maxChar = (char)curr[1];

            if(sb.length() >= 2 && sb.charAt(sb.length() - 1) == maxChar && sb.charAt(sb.length() - 2) == maxChar){
                if (pq.isEmpty()) {
                    break;
                }

                int[] nextCurr = pq.poll();
                int nextFreq = nextCurr[0];
                char nextChar = (char)nextCurr[1];

                sb.append(nextChar);
                nextFreq--;

                if(nextFreq > 0){
                    pq.offer(new int[]{nextFreq, nextChar});
                }
                pq.offer(new int[]{freq, maxChar});
            }else{
                sb.append(maxChar);
                freq--;

                if(freq > 0){
                    pq.offer(new int[]{freq, maxChar});
                }
            }
        }
        return sb.toString();
    }
}