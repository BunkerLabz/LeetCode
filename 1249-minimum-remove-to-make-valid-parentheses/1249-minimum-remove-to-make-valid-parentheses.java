class Solution {
    public String minRemoveToMakeValid(String s) {
        char ch[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        Stack<Integer> stCount = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(ch[i] == '(' || ch[i] == ')') {
                if(st.isEmpty()) {
                    st.push(ch[i]);
                    stCount.push(i);
                }
                else if(st.isEmpty() && ch[i] == ')') {
                    ch[i] = ' ';
                }
                else if(st.peek() == '(' && ch[i] == ')') {
                    st.pop();
                    stCount.pop();
                }
                else {
                    st.push(ch[i]);
                    stCount.push(i);
                }
            }
            else
                continue;
        }
        int i = 0;
        if(st.isEmpty()) {
            return String.valueOf(ch).replaceAll(" ", "");
        }
        else {
            while(!stCount.isEmpty()) {
                i = stCount.peek();
                ch[i] = ' ';  
                stCount.pop();
            }
        }
        return String.valueOf(ch).replaceAll(" ", "");
    }
}