class Solution {
    public:
    int gcd(int a, int b) {
        // code here
        if(a>b) return gcd(b,a);
        if(a==b || a==1) return a;
        if(b%a==0) return a;
        return gcd(a,b-a);
    }
};
