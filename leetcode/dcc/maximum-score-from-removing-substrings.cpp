// https://leetcode.com/problems/maximum-score-from-removing-substrings/

class Solution {
public:

    int solve(string &a,int x,int y){
        string s;
        int ans=0,n=a.size();
        for(int i=0;i<n;i++){
            if(s.size()!=0 && s.back()=='a' && a[i]=='b'){
                ans+=x;
                s.pop_back();}
            else{s.push_back(a[i]);}}
        a=s; n=a.size();
        for(int i=0;i<n;i++){
            if(s.size()!=0 && s.back()=='b' && a[i]=='a'){
                ans+=y;
                s.pop_back();}
            else{s.push_back(a[i]);}}
        return ans;}

    int maximumGain(string s, int x, int y) {
        int ans=0,n=s.size();
        string a;
        for(int i=0;i<n;i++){
            a.clear();
            while(i<n && s[i]=='a' || s[i]=='b'){
                a.push_back(s[i]);
                i++;}
            if(a.size()==0){continue;}
            if(y>x){
                reverse(a.begin(),a.end());
                ans+=solve(a,y,x);}
            else{ans+=solve(a,x,y);} 
            }
        return ans;
    }
};