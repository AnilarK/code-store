// https://leetcode.com/problems/minimum-deletions-to-make-string-k-special/

class Solution {
public:
    int minimumDeletions(string s, int k) {
        int n=s.size();
        vector<int>a(26,0);
        for(int i=0;i<n;i++){
            a[s[i]-'a']++;}
        vector<int>x;
        for(int i=0;i<26;i++){
            if(a[i]==0)continue;
            x.push_back(a[i]);}
        sort(x.begin(),x.end());
        
        int ans=INT_MAX,p=0;
        for(int i=0;i<x.size();i++){
            
            int s=0;
            for(int j=i+1;j<x.size();j++){
                if(x[j]-x[i]>k){ s+= (x[j]-x[i]) -k;}}
            ans=min(ans,s+p);
            p+=x[i];
        }
        
        return ans;
    }
};