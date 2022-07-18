class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int br = s.length();
        String reset = new String();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                if(s.charAt(i + 1) == ' ') {
                    br = i;
                    continue; 
                }
                else {
                    reset += s.substring(i + 1, br) + " ";
                    br = i;
                }
            }
            if(i == 0) {
                reset += s.substring(0, br);   
            }
        }
        return reset;
    }
}