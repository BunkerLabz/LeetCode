//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        String res[] = {"", ""};
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        String high = "";
        int max = 0;
        for(String name : map.keySet()) {
            if(map.get(name) > max) {
                high = name;
                max = map.get(name);
            }
            else if(map.get(name) == max) {
                if(high.compareTo(name) < 0) {
                    
                }
                else {
                    high = name;
                }
            }
        }
        res[0] = high;
        res[1] = Integer.toString(max);
        return res;
        // System.out.println(map);
        // String s[] = {"jhon", "4"};
        // return s;
    }
}

