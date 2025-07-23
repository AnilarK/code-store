// https://leetcode.com/problems/valid-word/

class Solution {
    public boolean isValid(String s) {
        boolean ans = true;
        int []a= new int[26];
        for(int i=0; i<s.length() ;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                a[s.charAt(i)-'a']++;}
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                a[s.charAt(i)-'A']++;}
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){}
            else{ans= ans&false;} }
        boolean p=false, q=false;
        for(int i=0;i<26;i++){
            if(a[i]==0) continue;
            if(i==0 || i==4 || i=='i'-'a' || i=='o'-'a' || i=='u'-'a'){p=true;}
            else{q=true;} }
        if(s.length()<3) ans=false;
        return ans&p&q;
    }
}