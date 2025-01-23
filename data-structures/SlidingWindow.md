## Sliding Window
- constant window
- longest subarray/substring where {condition}
- no of subarrays where {condition}
- Shortest/minimum window {condition}

__________________________________________
- TC: O(n + n)
- SC: O(1)

```c++
//longest subarray with sum<=K

l = 0, r = 0, sum = 0, maxLen = 0;
while(r<n) {
    sum = sum + arr[r];
    while(sum > k) {
        sum = sum -arr[l];
        l = l+1;
    }
    if(sum <=k) {
        maxLen =  max(maxLen, r-l+1);
    }
    r = r + 1;
}
return maxLen;

```