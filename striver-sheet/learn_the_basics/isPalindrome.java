class Solution {
    public boolean solve(String s,int i,int j){
        if(i>=j) return true;
        char a = Character.toLowerCase(s.charAt(i));
        char b = Character.toLowerCase(s.charAt(j));
        if( (a<'a' || a>'z') && (a<'0' || a>'9') ){ return solve(s,i+1,j);}
        if( (b<'a' || b>'z') && (b<'0' || b>'9') ){ return solve(s,i,j-1);}

        if(a==b){
            return solve(s,i+1,j-1);
        } else {
            return false;
        }
    }

    public boolean isPalindrome(String s) {
        int n=s.length();
        return solve(s,0,n-1);
    }
}