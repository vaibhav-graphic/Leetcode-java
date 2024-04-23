class Problem {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 1){
            return Collections.singletonList(0);
        }

        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        int[] indegree  = new int[n];
        List<Integer> res = new ArrayList<>();


        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            indegree[u]++;
            indegree[v]++;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            if(indegree[i] == 1){
                q.offer(i);
            }
        }

        while(n > 2){
            int size  = q.size();
            n -= size;

            for(int i=size; i>=0; i--){
                int u = q.poll();
                for(int v : adj.getOrDefault(u,Collections.emptyList())){
                    indegree[v]--;
                    if(indegree[v] == 1){
                        q.offer(v);
                    }
                }
            }

            while(!q.isEmpty()){
                res.add(q.poll());
            }
            return res;
        }
    }
}