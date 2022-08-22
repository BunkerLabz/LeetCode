class Solution 
{
    static int isPower(int n)
    {
        if(n == 0)
        return 0;
        while(n != 1)
        {
            if(n % 4 != 0)
            return 0;
            n = n / 4;    
        }
        return 1;
    }
    public boolean isPowerOfFour(int n) 
    {
        if(n <= 0) return false;
        else {
            if(isPower(n) == 1) return true;
            else return false;
        }
            
    }
}