class Solution {
    public boolean isPalindrome(int x) {
        int num=x,mun=0;
        if(x<0) return false;
        while(x!=0){
            mun= mun*10 + x%10;
            x=x/10;
        }
        return num==mun;
    }
}