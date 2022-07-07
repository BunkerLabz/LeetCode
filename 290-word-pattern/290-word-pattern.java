class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[] = s.split(" ");
        if(pattern.length() != word.length)
            return false;
        
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(map.get(pattern.charAt(i)).equals(word[i])) {
                    continue;
                }
                else
                    return false;
            }
            else {
                if(map.containsValue(word[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), word[i]);
            }
        }
        return true;
    }
}