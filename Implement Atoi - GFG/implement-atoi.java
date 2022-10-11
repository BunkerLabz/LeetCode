//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
        boolean neg = false;
        if(s.charAt(0) == '-') {
            s = s.substring(1);
            neg = !neg;
        }
        int res = 0;
        int o = 1;
	    for(int i = s.length() - 1; i >= 0; i--) {
	        if(s.charAt(i) - '0' > 9 || s.charAt(i) - '0' < 0) {
	            return -1;
	        }
	        else {
	            res += (s.charAt(i) - '0') * o;
	            o = o * 10;
	        }
	    }
	    if(neg)
	        res = res * -1;
	    
	    return res;
    }
}
