//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        int len = S.length();
        S = S + '~';
        int track = S.length() - 1;
        int idx = S.length();
        for(int i = len - 1; i >= 0; i--) {
            if(S.charAt(i) == '.') {
                
                S = S + S.substring(i, track);
                track = i;
            }
        }
        S = S + '.' + S.substring(0, track);
        return S.substring(idx + 1, S.length());
        // StringBuilder sb = new StringBuilder("");
        // int i=str.length()-1;
        // int j=str.length()-1;
        // while(i>=0){
        //     while(i>=0 && str.charAt(i)!='.'){
        //         i--;
        //     }
        //     if(i==-1){
        //         int k=i+1;
        //         while(k<=j){
        //             sb.append(str.charAt(k++));
        //         }
        //         break;
        //     }
        //     else if(str.charAt(i)=='.'){
        //         int k=i+1;
        //         while(k<=j){
        //             sb.append(str.charAt(k++));
        //         }
        //         sb.append(str.charAt(i));
        //         j=i-1;
        //         i--;
        //     } 
        // }
        // return sb.toString();
    }
}