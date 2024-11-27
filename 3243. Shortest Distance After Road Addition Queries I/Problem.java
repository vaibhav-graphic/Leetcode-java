class Problem {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int m = queries.length;
        int[] ans = new int[m];

        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < n - 1; i++){
            adj.get(i).add(i + 1);
        }

        for (int i = 0; i < m; i++) {
            // Process each query and update the adjacency list
            int u = queries[i][0];
            int v = queries[i][1];
            adj.get(u).add(v);

            // Perform BFS to find shortest distance from node 0 to node n-1
            ans[i] = bfs(adj, 0, n - 1, n);
        }

        return ans;
    }

    private int bfs(ArrayList<ArrayList<Integer>> adj, int start, int target, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        
        dist[start] = 0;
        q.offer(start);

        while (!q.isEmpty()) {
            int curr = q.poll();
            
            for (int neighbor : adj.get(curr)) {
                if (dist[neighbor] == Integer.MAX_VALUE) { // Unvisited node
                    dist[neighbor] = dist[curr] + 1; // Update distance
                    q.offer(neighbor);
                }
            }
        }

        // Return the shortest distance to the target node
        return dist[target] == Integer.MAX_VALUE ? -1 : dist[target];
    }
}
