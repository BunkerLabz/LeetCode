class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String s[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                      "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        String code = "";
        for(int i = 0; i < words.length; i++) {
            code = "";
            for(int j = 0; j < words[i].length(); j++) {
                code += s[words[i].charAt(j) - 'a'];
            }   
            set.add(code);
        }
        return set.size();
    }
}