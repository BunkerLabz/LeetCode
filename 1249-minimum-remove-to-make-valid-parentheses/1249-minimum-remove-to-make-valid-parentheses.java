class Solution {
    public String minRemoveToMakeValid(String s) {
        char ch[] = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(ch[i] == '(' || ch[i] == ')') {
                if(st.isEmpty() && ch[i] == ')') {
                    ch[i] = ' ';
                }
                else if(ch[i] == '(') {
                    st.push(i);
                }
                else {
                    st.pop();
                }
            }
        }
        int i = 0;
        if(st.isEmpty()) {
            return String.valueOf(ch).replaceAll(" ", "");
        }
        else {
            while(!st.isEmpty()) {
                i = st.peek();
                ch[i] = ' ';  
                st.pop();
            }
        }
        return String.valueOf(ch).replaceAll(" ", "");
    }
}