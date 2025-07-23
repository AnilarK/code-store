// https://leetcode.com/problems/find-lucky-integer-in-an-array/

class Solution {
public:
    int findLucky(vector<int>& arr) {
        int n=arr.size();
        while(n<501){arr.push_back(0); n++;}
        for(int i=0;i<arr.size();i++){
            arr[arr[i]%1000]+=1000;
        }
        for(int i=arr.size()-1;i>0;i--){
            if(i==(arr[i])/1000) return i;
        }
        return -1;
    }
};