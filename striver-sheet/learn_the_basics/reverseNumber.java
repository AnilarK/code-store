class Solution {
    public int reverseNumber(int x) {
        long ans=0;
        while(x!=0){
            ans = ans*10L + (x%10);
            x=x/10;}
        if( ans > ( (1L<<31) -1) || ans < (-1)*(1L<<31) ) return 0;
        return (int)ans;
    }
}