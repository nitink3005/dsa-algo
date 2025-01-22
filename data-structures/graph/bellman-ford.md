## bellman-ford 
- shortest path algo that determines shortest path between a given source vertex and every other vertex in graph.
- works with -ve edge weights
- helps to detect negative cycle on Nth iteration
- the shortest path cannot be found if there exist -ve edge cycle
- if graph path weight < 0 then there is -ve edge cycle


## Flow:
- relax all edges n-1 times
- on nth iteration if distance b/w node reduce -> -ve edge cycle
________________________________________________________________________________________________
- TC: O(V*E)
- SC: O(E)

```c++
    vector<int>bellmanFord(int V, vector<vector<int>>&edges, int S) {
        vector<int>dist(V, 1e9);
        dist[S] = 0;

        // V x E
        for(int i=0;i<V-1;i++) {
            for(auto it: edges) {
                int u = it[0];
                int v = it[1];
                int wt = it[2];
                if(dist[u]!=1e9 && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        //Nth Iteration
        for(auto it: edges) {
            int u = it[0];
            int v = it[1];
            int wt = it[2];
            if(dist[u]!=1e9 && dist[u] + wt < dist[v]) {
                return {-1};
            }
        }
        return dist;

     }
```