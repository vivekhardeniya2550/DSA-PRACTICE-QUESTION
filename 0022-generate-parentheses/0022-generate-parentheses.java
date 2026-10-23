 import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        fun("",0,0,n,l);
        return l;
    }
    
     void  fun(String p, int o,int c,int n,List<String> l) {
        // Base case: if the current string length reaches 2 * n, it's a valid combination
        if (o==n&&c==n) {
            l.add(p);
            return;
        }
        
        // Decision 1: Add an opening parenthesis if we haven't used all 'n' opening brackets
        if (o < n) 
            fun(p + "(", o + 1, c, n, l);
            
            
        

        
        // Decision 2: Add a closing parenthesis if it won't exceed the number of opening brackets
        if (c < o) 
    fun(p + ")", o, c + 1, n, l);
            
        
    }
}