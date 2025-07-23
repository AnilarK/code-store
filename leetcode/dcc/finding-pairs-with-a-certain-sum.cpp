// https://leetcode.com/problems/finding-pairs-with-a-certain-sum/

class FindSumPairs {
public:
vector<int>a,b;
map<int,int>m;
    FindSumPairs(vector<int>& a, vector<int>& b ) {
        this->a = a; this->b = b;
        for(int i=0;i<b.size();i++){m[b[i]]++;}
    }
    
    void add(int i, int v) {
        m[b[i]]--; b[i]+=v; m[b[i]]++;
    }
    
    int count(int t) {
        int ans=0;
        for(int i=0;i<a.size();i++){
            ans+=m[t-a[i]];}
        return ans;
        
    }
};

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs* obj = new FindSumPairs(nums1, nums2);
 * obj->add(index,val);
 * int param_2 = obj->count(tot);
 */