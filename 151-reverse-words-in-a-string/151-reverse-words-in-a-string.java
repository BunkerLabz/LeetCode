// class Solution {
//     public String reverseWords(String s) {
//         s = s.trim();
//         int br = s.length();
//         String reset = new String();
//         for(int i = s.length() - 1; i >= 0; i--) {
//             if(s.charAt(i) == ' ') {
//                 if(s.charAt(i + 1) == ' ') {
//                     br = i;
//                     continue; 
//                 }
//                 else {
//                     reset += s.substring(i + 1, br) + " ";
//                     br = i;
//                 }
//             }
//             if(i == 0) {
//                 reset += s.substring(0, br);   
//             }
//         }
//         return reset;
//     }
// }

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        int br = s.length();
        System.out.println(n);
        s += " -1 ";
        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                if(s.charAt(i + 1) == ' ') {
                    br = i;
                    continue;
                }
                else {
                    s += s.substring(i + 1, br) + " ";
                    System.out.println(br);
                    br = i;
                }
            }
            if(i == 0) {
                s += s.substring(0, br);
            }
        }
        return s.substring(n + 4);
    }
}
