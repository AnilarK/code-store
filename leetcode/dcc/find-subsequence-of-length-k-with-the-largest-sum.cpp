// https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/

class Solution {
public:
    vector<int> maxSubsequence(vector<int>& a, int k) {
        map<int,int>m,x;
        int n=a.size();
        for(int i=0;i<n;i++){
            m[a[i]]++;}
        while(n>k){
            auto it=(m.begin())->first;
            m[it]--;
            if(m[it]==0){m.erase(it);}
            x[it]++; n--;}
        vector<int>ans;
        for(int i=0;i<a.size();i++){
            if(x.find(a[i])!=x.end()){
                x[a[i]]--;
                if(x[a[i]]==0){x.erase(a[i]);}
                continue; }
            ans.push_back(a[i]); }
        return ans;
    }
};