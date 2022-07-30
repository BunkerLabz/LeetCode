class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> list = new ArrayList<>();
        int target[] = new int[26];
        for(String b : B) {
            int temp[] = new int[26];
            for(char c : b.toCharArray()) {
                temp[c - 'a']++;
                target[c - 'a'] = Math.max(temp[c - 'a'], target[c - 'a']);
            }
        }
        
        for(String a : A) {
            int temp[] = new int[26];
            for(char c : a.toCharArray()) temp[c - 'a']++;
            
            if(subSet(temp, target))
                list.add(a);
        }
        return list;
    }
    
    private boolean subSet(int temp[], int target[]) {
        for(int i = 0; i < 26; i++) {
            if(target[i] > temp[i]) return false;
        }
        return true;
    }
}