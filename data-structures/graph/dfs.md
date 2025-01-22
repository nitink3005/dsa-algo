## dfs
 TC : O(N + 2E) ( for each node n we traverse all adj nodes) <br/>
 SC : O(3N) (for storing res, visited arr , recursion stack space)

### Flow:
 - use recursion to traverse
 - mark node as visited in vis array & call next recursion

 ```c++

    void dfs(int node, vector<int>adj[], vector<int>&vis, vector<int>&res) {
        vis[node] = 1;
        res.push_back(node);
        for(auto it: adj[node]) {
            if(!vis[it]) {
                dfs(it, adj, vis, res);
            }
        }
    }

    vector<int>dfsOfGraph(int V, vector<int>adj[]) {
        vector<int>vis(V, 0);
        vector<int>res;
        int start = 0;
        dfs(start, adj, vis, res);
        return res;
    }
 ```