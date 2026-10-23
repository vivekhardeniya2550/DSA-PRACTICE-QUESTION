 import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
        // Base case: if the current string length reaches 2 * n, it's a valid combination
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }
        
        // Decision 1: Add an opening parenthesis if we haven't used all 'n' opening brackets
        if (open < max) {
            current.append('(');
            backtrack(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
        
        // Decision 2: Add a closing parenthesis if it won't exceed the number of opening brackets
        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}