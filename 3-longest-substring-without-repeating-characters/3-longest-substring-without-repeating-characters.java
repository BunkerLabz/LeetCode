class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(map.containsKey(s.charAt(j))) {
                    map.clear();
                    break;
                }
                else {
                    map.put(s.charAt(j), j);
                    if(longest < map.size())
                        longest = map.size();
                }
            }
        }
        return longest;
    }
}