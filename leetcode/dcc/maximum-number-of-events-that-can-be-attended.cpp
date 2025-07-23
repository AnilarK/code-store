// https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/

class Solution {
public:
    int maxEvents(vector<vector<int>>& a) {
        int n=a.size(),ans=0 ,n1=0;
        vector<vector<int>>x(1e5 + 10);
        for(int i=0;i<n;i++){
            n1=max(n1,max(a[i][0],a[i][1]));
            x[a[i][0]-1].push_back(a[i][1]-1);}
        map<int,int>m;
        for(int i=0;i<n1;i++){
            for(int j=0;j<x[i].size();j++){
                m[x[i][j]]++;}
            while(m.size()!=0 && m.begin()->first < i){
                m.erase(m.begin()->first);}
            if(m.size()!=0 && (m.begin())->first >=i){
                ans++;
                int it=(m.begin())->first;
                m[it]--;
                if(m[it]==0){m.erase(it);}
            }
        }
        return ans;
        
    }
};