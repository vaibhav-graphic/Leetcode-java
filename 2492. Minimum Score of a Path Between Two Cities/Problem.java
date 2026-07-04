class Pair{
    int node;
    int dis;

    Pair(int node, int dis){
        this.node = node;
        this.dis = dis;
    }
}

class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<Pair>> adj = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] road : roads){
            int u = road[0];
            int v = road[1];
            int dis = road[2];

            adj.get(u).add(new Pair(v, dis));
            adj.get(v).add(new Pair(u, dis));
        }

        int[] vis = new int[n + 1];
        int ans = Integer.MAX_VALUE;

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        vis[1] = 1;

        while(!q.isEmpty()){
            int cNode = q.poll();

            for(Pair temp : adj.get(cNode)){
                int adjNode = temp.node;
                int adjDis = temp.dis;

                ans = Math.min(adjDis, ans);

                if(vis[adjNode] == 0){
                    vis[adjNode] = 1;
                    q.offer(adjNode);
                }
            }
        }

        return ans;
    }
}