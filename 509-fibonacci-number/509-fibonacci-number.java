class Solution {
    public int fib(int n) {
        
        if(n == 0 || n == 1)
            return n;
        
        int n1 = 0, n2 = 1;
        int temp = 0;
        
        for(int i = 1; i < n; i++) {
            temp = n2;
            n2 += n1;
            n1 = temp;
        }
        
        return n2;
    }
}