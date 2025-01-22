## topological sorting

### usecase:
    - something before something
    - linear ordering of vertices such that if there is an edge b/w u & v, u appears before v in that ordering.
    - exists only in DAG(directed acyclic graph)
    - useful for detecting cycle in DAG
    - for DAG graph our count of topo array size should be equal to total nodes in given graph.

### Algo - Approach 1 (Normal DFS + STACK):
- TC : O(N + 2E) ( same as DFS) <br/>
- SC : O(3N) (for storing res, visited arr , recursion stack space)
- Normal DFS + Stack
- once all traversal complete , push node to stack

 ```c++

    void dfs(int node, vector<int>&vis, vector<int>&adj, stack<int>&st) {
        vis[node] = 1;
        for(auto it: adj[node]) {
            if(!vis[it]) {
                dfs(it, vis, adj, st);
            }
        }
        st.push(node);
    }

    vector<int>topoSort(int V, vector<int>adj[]) {
        vector<int>vis(V, 0);
        stack<int>st;
        int start = 0;
        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                dfs(i, vis, adj, st);
            }
        }

        vector<int>ans;
        while(!st.empty()) {
            ans.push_back(st.top());
            st.pop();
        }
        return ans;
    }
 ```

 ## Approach 2: BFS - Kahn's Algorithm
- TC : O(N + 2E) ( same as DFS) <br/>
- SC : O(N)
- insert all node of indegree 0 to Q
- take them out of Q, and keep reducing indegree of adj node
- if adjNode indegree = 0, push to Q

 ```c++
    vector<int>topoSort(int V, vector<int>adj[]) {
        int indegree[V] = {0};
        for(int i=0;i<V;i++) {
            for(auto it:adj[i]) {
                indegree[it]+=1;
            }
        }

        queue<int>q;
        for(int i=0 ;i<V;i++) {
            if(indegree[i] == 0) q.push(i);
        }
        
        vector<int>topo;
        while(!q.empty()) {
            int node = q.front();
            q.pop();
            topo.push_back(node);

            for(auto it: adj[node]) {
                indegree[it]--;
                if(indegree[it] == 0) {
                    q.push(it);
                }
            }
        }
        return topo;
    }
 ```
