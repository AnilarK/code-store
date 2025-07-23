// https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-i/

class Solution {
public:
    int maxFreeTime(int eventTime, int k, vector<int>& startTime, vector<int>& endTime) {
        vector<int>a;
        int zero=0;
        for(int i=0;i<startTime.size();i++){
            if(startTime[i]==0){zero=1;}
            a.push_back(startTime[i]);
            a.push_back(endTime[i]);}
        sort(a.begin(),a.end());
        vector<int>x;
        int last=0;
        for(int i=0;i<a.size();i+=2){
            x.push_back(a[i]-last);
            last=a[i+1];}
         x.push_back(eventTime-last);
        // for(int i=0;i<x.size();i++){
        //     cout<<x[i]<<" ";}cout<<endl;
        int ans=0,sum=0;
        for(int i=0;i<=k;i++){
            sum+=x[i];}
        ans=sum;
        for(int i=k+1;i<x.size();i++){
            sum+=x[i] - x[i-k-1];
            // cout<<sum<<endl;
            ans=max(ans,sum);}    
        return ans;
    }
};