// https://leetcode.com/problems/longest-harmonious-subsequence/

class Solution {
public:
    int findLHS(vector<int>& a) {
        int n=a.size(),ans=0;
        map<int,int>m;
        for(int i=0;i<n;i++){m[a[i]]++;}
        for(auto it=m.begin();it!=m.end();it++){
            int p=it->first;
            if(m.find(p+1)==m.end()) continue;
            ans=max(ans,m[p]+m[p+1]);}
        return ans;
    }
};