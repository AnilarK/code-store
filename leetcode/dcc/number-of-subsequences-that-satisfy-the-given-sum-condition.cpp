// https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/

class Solution {
public:

int p(long long x){
    long long ans=1,mo=1000000007,p=2;
    if(x<0){return 0;}
    while(x!=0){
        if(x%2==1){ ans=ans*p; }
        x=x/2; p=(p*p)%mo;
        ans=ans%mo;}
    return ans;
}


    int numSubseq(vector<int>& a, int t) {
        sort(a.begin(),a.end());
        long long ans=0,mo=1000000007;
        for(int i=0;i<a.size();i++){
            auto it=upper_bound(a.begin(),a.end(),t-a[i])-a.begin();
            ans+=p(it-i-1);
            ans=ans%mo;}


        return ans;

    }
};