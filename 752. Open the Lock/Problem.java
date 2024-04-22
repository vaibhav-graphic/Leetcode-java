class Problem {
    public int openLock(String[] deadends, String target) {
        Set<String> set = new HashSet<>();

        for(String deadend : deadends){
            set.add(deadend);
        }

        String start = "0000";

        if(set.contains(start)){
            return -1;
        }

        Queue<String> q = new LinkedList<>();
        q.offer(start);

        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();


        for(int i=0; i<size; i++){
            String curr = q.poll();

            if(curr.equals(target)){
                return level;
            }

            StringBuilder currForm = new StringBuilder(curr);
            fillNeighbours(q,currForm,set);
        }
        level++;
        }
        return -1;
    }

    private void fillNeighbours(Queue<String> q,StringBuilder curr,Set<String> set){
        for(int i=0; i<4; i++){
            char ch = curr.charAt(i);

            char dec = (ch == '0') ? '9' : (char)(ch - 1);
            char inc = (ch == '9') ? '0' : (char)(ch + 1);

            curr.setCharAt(i,dec);
            String decStr = curr.toString();

            if(!set.contains(decStr)){
                set.add(decStr);
                q.offer(decStr);
            }

            curr.setCharAt(i,inc);
            String incStr = curr.toString();

            if(!set.contains(incStr)){
                set.add(incStr);
                q.offer(incStr);
            }
            curr.setCharAt(i,ch);
        }
    }
}