class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        int head = 0, tail = s.length() - 1;
        char ch;
        char ct;
        while(head <= tail) {
            ch = s.charAt(head);
            ct = s.charAt(tail);
            if(!Character.isLetterOrDigit(ch))
                head++;
            else if(!Character.isLetterOrDigit(ct))
                tail--;
            else {
                if(ch != ct) {
                    return false;
                }
                head++;
                tail--;
                
            }
        }
        return true;
    }
}