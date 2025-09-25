// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num = n, ans=0;
        while(n!=0){
            ans+= (n%10)*(n%10)*(n%10);
            n=n/10;
        }
        return num==ans;
    }
}