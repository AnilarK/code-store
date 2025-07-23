// https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k/

class Solution {
public:
    int solve(int i,int sum,long long p,string &s,int k,vector<int>&dp){
        if(i<0) return 0;
        if(p>INT_MAX){p=INT_MAX;}
        int take=0,not_take=0;
        if(dp[i]!=-1) return dp[i];
        if(s[i]=='1'){
            if(sum+p <=k){
                take = 1 + solve(i-1,sum+p,p*2LL,s,k,dp);}
        } else{
            take = 1 + solve(i-1,sum,p*2LL,s,k,dp);
        }
        
        not_take = solve(i-1,sum,p,s,k,dp);
        return dp[i]=max(take,not_take);
    }

    int longestSubsequence(string s, int k) {
        int n=s.size();
        vector<int>dp(n,-1);
        return solve(n-1,0,1LL,s,k,dp);
    }
};