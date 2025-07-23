// https://leetcode.com/problems/find-the-original-typed-string-i/

class Solution {
public:
    int possibleStringCount(string s) {
        int ans=1;
        for(int i=0;i<s.size();){
            int x=0;
            char p=s[i];
            while(i<s.size() && s[i]==p){x++; i++;}
            ans+=x-1;
        }
        return ans;
        
    }
};