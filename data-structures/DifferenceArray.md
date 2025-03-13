## Difference Array

- Famous technique use to efficiently apply range updates to an array.
- It helps to do multiple updates in constant time. (Ideal for range modication problems)
- TC : O(N x Q) => O(N) (helps optimise brute force sol of NxQ to O(N))
- TC: O(N) (for difference arr algo)

Let's take an example to understand
```c++

n = 5 
nums = {0, 0, 0, 0, 0}
updateQueries = [(1,3,2), (2,4,3), (0,2,-2)]

(1,3,2) =>  {0, 2, 0, 0, -2}
(2,4,3) =>  {0, 2, 3, 0, -2}
(0,2,-2) => {-2, 2, 3, 2, -2}

prefixSum = {-2, 0, 3, 5, 3}

impl:
    [L, R, x] => arr[L]+=x
                 arr[R+1]-=x    (x+1 < n)
```
- Best suited for problems where you need to perform multiple range updates (like +/- a value over a range)
- You don't need to query the array frequently after updates
- Highly Efficient when you only need to apply a sequence of range operations and get done.

=> Difference Arr = O(1) constant <br/>
=>   Then you perform single Pass O(n) to apply all changes (cumm. sum)

### Problems
1) Leetcode 370. Range Addition [premium]
<img src="./img/LC_370_Range_Addition_DifferenceArray.png">

```c++
TC: O(n+k) , each of k operation done in constant O(1) time, final cum sum takes O(n)
SC: O(n)

#include<bits/stdc++.h>
using namespace std;

vector<int>helper(int length, vector<vector<int>>&updates) {
    vector<int>res(length, 0);
    for(auto update: updates) {
        int startIdx = update[0];
        int endIdx = update[1];
        int inc = update[2];
        
        res[startIdx]+=inc;
        if(endIdx+1 < length) {
            res[endIdx+1]-=inc;
        }
    }
    
    for(int i=1;i<res.size();i++) {
        res[i]+=res[i-1];
    }
    
    return res;
}

int main() {
    int length = 5;
    vector<vector<int>>updates{{1,3,2},{2,4,3},{0,2,-2}};
    vector<int>res = helper(length, updates);
    for(auto it: res) {
        cout<<it<<"  ";
    }
    return 0;
}
```
2) [Leetcode 2381. Shifting Letters II](https://leetcode.com/problems/shifting-letters-ii/?envType=problem-list-v2&envId=af10jqbg)
3) [Leetcode 3356. Zero Array Transformation II](https://leetcode.com/problems/zero-array-transformation-ii/)
