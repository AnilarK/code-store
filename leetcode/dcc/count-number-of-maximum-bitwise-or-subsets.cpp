// https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/

class Solution {
public:

    void fuck(int x,int i,vector<int>&a,map<int,int>&m){
        if(i==a.size()){m[x]++;}
        else{
            fuck(x|a[i],i+1,a,m);
            fuck(x,i+1,a,m);}}

    int countMaxOrSubsets(vector<int>& a) {
        map<int,int>m;
        fuck(0,0,a,m);
        return (m.rbegin())->second;

        
    }
};