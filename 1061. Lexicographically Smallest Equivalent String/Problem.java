class DisjointSet{
    int[] parent;

    DisjointSet(int n){
        parent = new int[n + 1];

        for(int i = 0; i <= n; i++){
            parent[i] = i;
        }
    }

    int findParent(int node){
        if(parent[node] == node){
            return node;
        }

        return parent[node] = findParent(parent[node]);
    }

    void unionBySize(int u, int v){
        int parU = findParent(u);
        int parV = findParent(v);

        if(parU != parV){
            if(parU < parV){
                parent[parV] = parU;
            }else{
                parent[parU] = parV;
            }
        }
    }
}

class Problem {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        DisjointSet ds = new DisjointSet(26);

        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            int n1 = ch1 - 'a';
            int n2 = ch2 - 'a';

            ds.unionBySize(n1, n2);
        }       

        char[] smarr = new char[26];

        for(int i = 0; i < 26; i++){
            smarr[i] = (char) (ds.findParent(i) + 'a');
        }

        StringBuilder sb = new StringBuilder(baseStr);

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            sb.setCharAt(i, smarr[ch - 'a']);
        }

        return sb.toString();
    }
}