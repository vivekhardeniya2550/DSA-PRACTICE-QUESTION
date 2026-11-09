 class Solution {
    public String countAndSay(int n) {
        String current = "1";
        
        for (int i = 2; i <= n; i++) {
            StringBuilder nextString = new StringBuilder();
            int length = current.length();
            int count = 1;
            
            for (int j = 1; j < length; j++) {
                if (current.charAt(j) == current.charAt(j - 1)) {
                    count++;
                } else {
                    nextString.append(count).append(current.charAt(j - 1));
                    count = 1;
                }
            }
            nextString.append(count).append(current.charAt(length - 1));
            current = nextString.toString();
        }
        
        return current;
    }
}