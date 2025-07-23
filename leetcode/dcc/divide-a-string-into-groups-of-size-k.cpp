// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/

class Solution {
public:
    vector<string> divideString(string s, int k, char fill) {
        vector<string>ans;
        int n=s.size();
        for(int i=0;i<n;i+=k){
            int j=i,p=0;
            string x;
            while(j<n && p!=k){
                x+=s[j];
                j++; p++;}
            while(p!=k){
                p++;
                x+=fill;}
            ans.push_back(x);
        }

        return ans;
        
    }
};