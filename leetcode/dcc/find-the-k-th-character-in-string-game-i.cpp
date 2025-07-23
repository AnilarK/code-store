// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/

class Solution {
public:
    char kthCharacter(int k) {
        string a="a";
        while(a.size()<k){
            string p=a;
            for(int i=0;i<p.size();i++){
                p[i]=(p[i]+1-'a')%26 +'a';
            }
            a+=p;
        }
        return a[k-1];
        
    }
};