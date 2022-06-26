class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(st.isEmpty()) {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
            else {
                if(s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                }
                else if(s.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                }
                else if(s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                }
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}