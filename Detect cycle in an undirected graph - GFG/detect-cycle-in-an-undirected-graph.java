//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean[] vis = new boolean[V];
        
        for(int i = 0; i < V; i++) vis[i] = false;
        
        for(int i = 0; i  < V; i++) {
            if(vis[i] == false) {
                if(check(i, V, vis, adj)) return true;
            }
        }
        
        return false;
        
    }
    public boolean check(int i, int V, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        Queue<Pair> q = new LinkedList<>();
        vis[i] = true;
        q.add(new Pair(i, -1));
        while(!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().next;
            q.remove();
            
            for(int adjNode : adj.get(node)) {
                if(vis[adjNode] == false) {
                    vis[adjNode]= true;
                    q.add(new Pair(adjNode, node));
                }
                else if(parent != adjNode){
                    return true;
                } 
            }
        }
        return false;
    }
}

class Pair{
    int first;
    int next;
    public Pair(int first, int next) {
        this.first = first;
        this.next = next;
    }
}