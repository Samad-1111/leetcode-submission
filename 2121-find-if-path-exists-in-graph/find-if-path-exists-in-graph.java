// works only for undirected graph. a --> b == b --> a.

class Solution {

    int[] parent;
    int[] rank;

    int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }return parent[x];
    }

    void union(int x,int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX != rootY){
            if(rank[rootX] > rank[rootY]){
                parent[rootY] = rootX;
            }
            else if(rank[rootY] > rank[rootX]){
                parent[rootX] = rootY;
            }
            else{
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        rank = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
            rank[i] = 1;
        }
        for(int[] edge : edges){
            union(edge[0],edge[1]);
        }return find(source) == find(destination);
    }
}