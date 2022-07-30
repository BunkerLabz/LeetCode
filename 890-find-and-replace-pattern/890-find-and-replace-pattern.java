class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        
        for(String s : words) {
            if(match(s, pattern)) {
                list.add(s);
            }
        }
        
        return list;
    }
    
    private boolean match(String s, String pattern) {
        char patternToWord[] = new char[26];
        char wordToPattern[] = new char[26];
        
        for(int i = 0; i < s.length(); i++) {
            if(patternToWord[pattern.charAt(i) - 'a'] == 0) {
                patternToWord[pattern.charAt(i) - 'a'] = s.charAt(i);
            }
            if(wordToPattern[s.charAt(i) - 'a'] == 0) {
                wordToPattern[s.charAt(i) - 'a'] = pattern.charAt(i);
            }
            if(patternToWord[pattern.charAt(i) - 'a'] != s.charAt(i) || wordToPattern[s.charAt(i) - 'a'] != pattern.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}