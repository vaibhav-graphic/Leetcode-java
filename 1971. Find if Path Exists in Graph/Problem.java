class Problem {
    private boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination){
            return true;
        }

        Map<Integer,List<Integer>> graph = new HashMap<>();
        boolean[] vis = new boolean[n];
        
        for(int i=0; i<n; i++){
            graph.put(i,new ArrayList<>());
        }

        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        dfs(graph,vis,source,destination);
        return found;
    }

    private void dfs(Map<Integer,List<Integer>> graph,boolean[] vis,int source,int destination){
        if(vis[source] == true || found){
            return;
        }

        vis[source] = true;

        for(int node : graph.get(source)){
            if(node == destination){
                found = true;
                break;
            }
            if(!vis[node]){
                dfs(graph,vis,node,destination);
            }
        }
    }
}