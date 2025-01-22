## bfs
 TC : O(N + 2E) ( for each node n we traverse all adj nodes) <br/>
 SC : O(3N) (queue, visited)

### usecase : 
    - shortest distance
    - shortest time to travers

### Flow:
 - insert one node to Q
 - mark node as visited
 - keep traversing unitl Q not empty

 ```c++
    vector<int>bfsOfGraph(int V, vector<int>adj[]) {
        int vis[n] = {0};
        vis[0] = 1;
        queue<int>q;
        q.push(0);

        vector<int>bfs;
        while(!q.empty()) {
            int node = q.front();
            q.pop();
            bfs.push(node);

            for(auto it: adj[node]) {
                if(!vis[it]) {
                    vis[it] = 1;
                    q.push(it);
                }
            }
        }
        return bfs;
    }
 ```