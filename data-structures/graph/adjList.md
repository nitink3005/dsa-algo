## graph

- adjMatrix (SC : O(N*N))
```c++
int main() {
    int n, m;
    cin>>n>>m;
    vector<int>adj[n+1][m+1];
    for(int i=0;i<m;i++) {
        int u, v;
        cin>>u>>v;
        adj[u][v] = 1;
        adj[v][u] = 1;
    }
    return 0;
}

```
- adjList (undirected graph) (SC: O(2E))
```c++

int main() {
    int n, m;
    cin>>n>>m;
    vector<pair<int, int>>adj[n+1];
    for(int i=0;i<n;i++) {
        int u, v, wt;
        cin>>u>>v>>wt;
        adj[u].push_back({v, wt});
        adj[v].push_back({u, wt});
    }
    return 0;
}

```