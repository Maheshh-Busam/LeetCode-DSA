// Last updated: 7/2/2026, 7:12:54 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String[] words = s.trim().split("\\s+");
4
5        return words[words.length - 1].length();
6    }
7}