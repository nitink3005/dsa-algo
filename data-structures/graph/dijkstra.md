## dijkstra 
- finding shortest path b/w  all nodes in a directed graph from source vertex S
- dijkstra doesn't work <br/> 
    - 1) negative weight 
    - 2) -ve cycle

- can be implemented through <br/>
    - 1) set
    - 2) priority queue (like bfs) (minHeap)

## Flow:
- declare dist arr with 1e9 distance
- Mark scr node dist = 0, push to q
- if adjNode edgeWt + currDist < dis[adjNode] then update dist and push to pq(minHeap)
________________________________________________________________________________________________
- TC: O(ElogV) (for inserting all nodes and for pop from pq it takes logV)
- SC: O(E)

```c++
    vector<int>dijkstra(int V, vector<vector<int>>adj, int S) {
        
        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<int>>pq; //{wt, src}
        vector<int>dist(V);
        for(int i=0;i<V;i++) dist[i] = 1e9;

        dist[S] = 0;
        q.push({0, S});
        while(!pq.empty()) {
            int dis = pq.top().first;
            int node = pq.top().second;
            pq.pop();

            for(auto it: adj[node]) {
                int edgeWeight = it[1];
                int adjNode = it[0];
                if(dis + edgeWeight < dis[adjNode]) {
                    dis[adjNode] = dis + edgeWeight;
                    pq.push({dist[adjNode], adjNode});
                }
            }
        }
        return dist;
    }
```