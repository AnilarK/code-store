//User function template for C++

class Solution {
  public:
   int t(char a){
       if(a=='I'){return 1;}
       else if(a=='V'){return 5;}
       else if(a=='X'){return 10;}
       else if(a=='L'){return 50;}
       else if(a=='C'){return 100;}
       else if(a=='D'){return 500;}
       else{return 1000;}}
    int romanToDecimal(string &str) {
       int ans=0;
       for(int i=0;i<str.size();i++){
           if(i<str.size()-1 && t(str[i])<t(str[i+1])){
               ans-=t(str[i]);}
           else{ans+=t(str[i]);} }
       return ans;
    }
};

