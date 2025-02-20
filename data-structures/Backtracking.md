## Backtracking

### Problems
- https://leetcode.com/problems/find-unique-binary-string/
- https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/

- For Backtracking problem Template is :
    - Do
    - Explore
    - Undo

- If Qn asks you to try all possible sequence for length n
- Constraints are like
    - 1 <= n <= 10


### Find Unique Binary String
- https://leetcode.com/problems/find-unique-binary-string/
```c++
class Solution {
public:
    void solve(string curr, string &ans, unordered_set<string>&st, int n) {
        if(curr.size() == n) {
            if(st.find(curr) == st.end()) {
                ans = curr;
                return;
            }
            st.insert(curr);
            return;
        }

        for(char ch='0';ch<='1';ch++) {
            //Do
            curr.push_back(ch);

            //Explore
            solve(curr, ans, st, n);
            if(ans!="") return; //if found ans then return

            //Undo
            curr.pop_back();
        }
    }
    
    string findDifferentBinaryString(vector<string>& nums) {
        //TC: O(2^n) ( as we can have 0 or 1) | SC : O(1) (as we are storing ans in string ans)
        int n = nums.size();
        string ans = "";
        string curr = "";
        unordered_set<string>st(nums.begin(), nums.end());
        
        solve(curr, ans, st, n);
        
        return ans;
    }
};
```