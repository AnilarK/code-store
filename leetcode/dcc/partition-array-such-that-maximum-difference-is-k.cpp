// https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/

class Solution {
public:
    int partitionArray(vector<int>& a, int k) {
        int ans=0,n=a.size();
        sort(a.begin(),a.end());
        for(int i=0;i<n;){
            int p=a[i];
            while(i<n && a[i]-p <=k){
                i++;}
            ans++; }
        return ans;
        
    }
};