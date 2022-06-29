class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        String temp = new String();
        String newString = new String();
        char ch[] = s.toCharArray();
        int br = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i == 0) {
                st.push(i);
            }
            else if(ch[i] == '(') {
                st.push(i);
            }
            else if (ch[i] == ')') {
                st.pop();
                if (i != 0 && st.isEmpty()) {
                    temp = s.substring(br + 1, i);
                    br = i + 1;
                    newString += temp;
                }
            }
        }
        ch = null;
        return newString;
    }
}