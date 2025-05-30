class Pair{
    int node;
    int dis;

    Pair(int node, int dis){
        this.node = node;
        this.dis = dis;
    }
}

class Problem {
    private int[] bfs(List<List<Integer>> adj, int node, int n){
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[node] = 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(node, 0));

        while(!q.isEmpty()){
            Pair pair = q.poll();

            int cNode = pair.node;
            int cDis = pair.dis;

            for(int adjNode : adj.get(cNode)){
                if(cDis + 1 < dist[adjNode]){
                    dist[adjNode] = cDis + 1;
                    q.offer(new Pair(adjNode, dist[adjNode]));
                }
            }
        }

        return dist;
    }
        
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;

        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++){
            int u = i;
            int v = edges[i];

            if(v == -1){
                continue;
            }

            adj.get(u).add(v);
        }


        int[] dist1 = bfs(adj, node1, n);
        int[] dist2 = bfs(adj, node2, n);

        int minNode = -1;
        int minDis = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int maxDis = Math.max(dist1[i], dist2[i]);

            if(minDis > maxDis){
                minDis = maxDis;
                minNode = i;
            }
        }

        return minNode;
    }
}