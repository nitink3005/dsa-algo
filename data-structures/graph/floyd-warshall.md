## floyd-warshall
- multi source shortest path algo
- detect -ve cycles

____________________________________
- TC: O(N^3)
- SC: O(V^2)

```c++
void shortest_distance(vector<vector<int>>&matrix) {
    int n = matrix.size();
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(matrix[i][j] == -1) {
                matrix[i][j] = 1e9;
            }
        }
        if(i == j) matrix[i][j] = 0; //distance from same node to same node is 0
    }

    for(int k=0;k<n;k++) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = min(matrix[i][j], matrix[i][k] + matrix[k][j]);
            }
        }
    }
}

```