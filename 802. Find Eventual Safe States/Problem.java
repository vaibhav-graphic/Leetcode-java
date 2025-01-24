class Problem {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;

        int[] vis = new int[V];
        int[] pathVis = new int[V];
        int[] check = new int[V];

        for(int i = 0; i  <V; i++){
            if(vis[i] == 0){
                dfs(graph, vis, pathVis, check, i);
            }
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < V; i++){
            if(check[i] == 0){
                res.add(i); 
            }
        }

        return res;
    }

    private boolean dfs(int[][] graph, int[] vis, int[] pathVis, int[] check, int node){
        vis[node] = 1;
        pathVis[node] = 1;
        check[node] = 1;

        for(int neighbour : graph[node]){
            if(vis[neighbour] == 0){
                if(dfs(graph, vis, pathVis, check, neighbour) == true){
                    return true;
                }
            }
            else if(pathVis[neighbour] == 1){
                return true;
            }
        }

        check[node] = 0;
        pathVis[node] = 0;
        return false;
    }
}