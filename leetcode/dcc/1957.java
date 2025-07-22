<<<<<<< HEAD
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;){
            char p = s.charAt(i);
            int cnt = 0;
            while(i<n && s.charAt(i)==p){
                i+=1; cnt+=1;}
            cnt=Math.min(cnt,2);
            while(cnt>0){
                cnt--;
                ans.append(p); }
        }
        return ans.toString();
    }
}
=======
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;){
            char p = s.charAt(i);
            int cnt = 0;
            while(i<n && s.charAt(i)==p){
                i+=1; cnt+=1;}
            cnt=Math.min(cnt,2);
            while(cnt>0){
                cnt--;
                ans.append(p); }
        }
        return ans.toString();
    }
}
>>>>>>> ce23edfd30c52169b154bbb5f716599fd29a0f2d
