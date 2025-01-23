## BinarySearch
- Searching algo in a limited search space(sorted)
- min-max qn (aggr cows, book allocation)
- binary search on answer(monotonic fns)
- predicate fns : fns that return true of false for every input.

- Monotonic predicate fn  : TTTTTFFFF or FFFFTTTT
- if ans goes from not possible to possible (opp polarity) we then return that eg : hi

____________________________________________________
- TC: O(log2N) (as search space gets reduced to half each time)
- SC: O(1)

```c++

int search(vector<int>&nums, int target) {
    int n = nums.size();
    int low = 0, high = n-1;
    while(low<=high) {
        int mid = (low + (high - low)/2);;
        if(nums[mid] == target) return mid;
        else if(target > nums[mid]) low = mid+1; //shrinking search space
        else high = mid -1;
    }
    return -1;
}


```