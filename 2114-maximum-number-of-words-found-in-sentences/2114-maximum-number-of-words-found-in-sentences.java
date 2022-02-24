class Solution {
    public int mostWordsFound(String[] s) {
        int n = s.length - 1;
        int total = 0;
        int count = 0;
        int i = 0;
        char ch;
        while(n >= 0) {
            total = 0;
            n--;
            int len = s[i].length();
            for(int j = 0; j < len; j++) {
                ch = s[i].charAt(j);
                if(ch == ' ') {
                    total++;
                }
                else
                    continue; 
            }
            i++;
            if(total > count) {
                count = total;
            }
            
        }
        return count + 1;
    }
}