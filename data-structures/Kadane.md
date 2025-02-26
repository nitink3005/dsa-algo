## Kadane' Algorithm

- Can be used to find the maximum subarray sum in O(N)
- Min subarray sum <br/>
``` TC: O(N) | SC: O(1)```

### Problem
[Maximum Absolute Sum of Any Subarray](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray)

### Template Kadane
```c++

#include<bits/stdc++.h>
using namespace std;

int maxSubArrSum(vector<int>&arr) {
    int currSum = arr[0];
    int maxSum = arr[0];

    for(int i=1;i<arr.size();i++) {
        currSum = max(currSum + arr[i], arr[i]); //if taking arr[i] + currSum or starting fresh...
        maxSum = max(maxSum, currSum);
    }
    return maxSum;
}

int main() {
    vector<int>arr = {1, 2, 3, -4, 5, 6};
    cout<<maxSubArrSum(arr)<<endl;
}

```