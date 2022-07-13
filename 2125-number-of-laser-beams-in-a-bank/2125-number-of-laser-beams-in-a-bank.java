class Solution {
    public int numberOfBeams(String[] bank) {
        int arr[] = new int[bank.length];
        int count = 0;
        for(int i = 0; i < bank.length; i++) {
            String s = bank[i];
            if(s.indexOf("1") != -1) {
                count++;
            }
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '1') {
                    arr[i]++;
                }
            }
        }
        if(count == 1 || count == 0) {
            return 0;
        } 
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] == 0) {
                arr[i + 1] = arr[i];
                arr[i] = 0;
            }
            else {
                arr[i] = arr[i] * arr[i + 1];
            }
            
            if(i != 0 && arr[i - 1] != 0) {
                System.out.println("Invoked");
                arr[i] += arr[i - 1];
            }
            System.out.println(arr[i]);
            
        }
        
        return arr[arr.length - 2];
    }
}