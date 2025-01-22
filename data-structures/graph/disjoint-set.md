## disjoint-set (union & find)
- for finding extra edge (Tree is valid if for n nodes we have n-1 edges)
- helps to keep track of nodes in connected components
- also used in Kruskal algo for MST(min spanning tree)
____________________________________________________________
- TC : constant time complexity 

```c++
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
```