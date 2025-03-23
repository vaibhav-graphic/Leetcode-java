class Pair{
    int node;
    long weight;

    Pair(int node, long weight){
        this.node = node;
        this.weight = weight;
    }
}

class Solution {
    public int countPaths(int n, int[][] roads) {
        List<List<Pair>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }        

        for(int[] road : roads){
            int u = road[0];
            int v = road[1];
            int wt = road[2];

            adj.get(u).add(new Pair(v, wt));
            adj.get(v).add(new Pair(u, wt));
        }

        long[] dist = new long[n];
        int[] ways = new int[n];

        for(int i = 0; i < n; i++){
            dist[i] = Long.MAX_VALUE;
            ways[i] = 0;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(x -> x.weight));
        pq.offer(new Pair(0, 0));
        dist[0] = 0;
        ways[0] = 1;

        while(!pq.isEmpty()){
            Pair pair = pq.poll();

            int cNode = pair.node;
            long cW = pair.weight;

            for(Pair temp : adj.get(cNode)){
                int adjNode = temp.node;
                long adjW = temp.weight;

                if(cW + adjW < dist[adjNode]){
                    dist[adjNode] = cW + adjW;
                    pq.offer(new Pair(adjNode, dist[adjNode]));
                    ways[adjNode] = ways[cNode];
                }
                else if(cW + adjW == dist[adjNode]){
                    ways[adjNode] = (ways[adjNode] + ways[cNode]) % 1_000_000_007;
                }
            }
        }

        return (int)ways[n - 1] % 1_000_000_007;
    }
}