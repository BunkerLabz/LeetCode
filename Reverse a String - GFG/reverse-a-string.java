//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String s)
    {
        int i = 0; 
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while(i < j) {
            ch[i] = s.charAt(j);
            ch[j] = s.charAt(i);
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
}