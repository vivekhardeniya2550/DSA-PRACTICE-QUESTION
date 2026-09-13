class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[256];

        int max = 0;
        int st = 0, e = 0;

        while (e < s.length()) {
            freq[s.charAt(e)]++;

            while (freq[s.charAt(e)] > 2) {
                freq[s.charAt(st)]--;
                st++;
            }

            int size = e - st + 1;
            max = Math.max(max, size);

            e++;
        }

        return max;
    }
}