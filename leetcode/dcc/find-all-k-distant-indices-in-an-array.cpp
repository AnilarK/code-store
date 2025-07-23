// https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/

class Solution {
public:
    vector<int> findKDistantIndices(vector<int>& a, int key, int k) {
        int n=a.size();
        vector<int>p(n+1,0),ans;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                p[max(0,i-k)]++;
                p[min(n,i+k+1)]--;} }
        int x=0;
        for(int i=0;i<n;i++){
            x+=p[i];
            if(x>0){ans.push_back(i);}}
        return ans;
    }
};