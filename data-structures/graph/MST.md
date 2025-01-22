## MST(minimum spanning tree)
- Kruskal's algorithm helps to find the min spanning tree.
- MST : if a graph can be represented in n nodes and n-1 edges such that we can reach from 1 node to every other node.

## Flow Kruskal's Algo
- sort all edges acc to wt
- then we iterate for all and see if parent not same add the wt and then do union
___________________________________________________________________________________________________
- TC: O(ElogV)
- SC: O(V + E), where V is the number of vertices and E is the number of edges in the graph.

```cpp

class UnionFind {
    vector<int> parent, size;
public:
    UnionFind(int n) {
        parent.resize(n); 
        size.resize(n);
        for (int i = 0; i < n; i++) {
            parent[i] = i; 
            size[i] = 1;
        }
    }
    int find(int x) {
        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]); // Path compression
    }

    bool Union(int u, int v) {
        int pu = find(u);
        int pv = find(v);
        if (pu == pv) return false; // Return False if u and v are already union
        if (size[pu] > size[pv]) { // Union by larger size
            size[pu] += size[pv];
            parent[pv] = pu;
        } else {
            size[pv] += size[pu];
            parent[pu] = pv;
        }
        return true;
    }
};


int spanningTree(int V, vector<vector<int>>&adj) {
    vector<pair<pair<int, int>>>edges;

    //O(N+E)
    for(int i=0;i<V;i++) {
        for(auto it: adj[i]) {
            int adjNode = it[0];
            int wt = it[1];
            int node = i;
        }
        edges.push_back({wt, {node, adjNode}});
    }

    sort(edges.begin(), edges.end()); //NlogM
    UnionFind uf(V);

    int mstWt = 0;

    //O(M * alpha)
    for(auto it: edges) {
        int wt = it.first;
        int u = it.second.first;
        int v = it.second.second;
        
        if(uf.findParent(u)!=uf.findParent(v)) {
            mstWt+=wt;
            uf.Union(u, v);
        }
        return mstWt;
    }
}

```