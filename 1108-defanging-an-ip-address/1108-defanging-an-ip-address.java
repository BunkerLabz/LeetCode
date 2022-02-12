class Solution {
    public String defangIPaddr(String address) {
        int n = address.length();
        String s = new String("");
        for(int i = 0; i < n; i++) {
            if(address.charAt(i) == '.') {
                s = s + "[.]";
            }
            else
                s = s + address.charAt(i);
        }
        return s;
    }
}