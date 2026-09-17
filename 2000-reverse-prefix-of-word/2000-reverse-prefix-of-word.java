 class Solution {
    public String reversePrefix(String word, char ch) {
        int l=0;
        int x=0;
      while(l<word.length()){
           if(word.charAt(l)==ch){
             x=l;
             break;
           }
           else{
            l++;
           }
      }
      String ans="";
      for(int i=x;i>=0;i--){
        ans+=word.charAt(i);
      }
      for(int i=x+1;i<word.length();i++){
        ans+=word.charAt(i);
      }
      return ans;  
    }
}