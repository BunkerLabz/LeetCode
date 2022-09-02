/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<Double> ll = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>(); // in bfs we take queue to traverse one level completely

        if (root == null) {
            return ll;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();  // here n is the level size or number of elements in level
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll(); // removing/polling a node 
                sum += node.val; // adding it to sum of the level
                if (node.left != null) { // now again we will add remove node left and right to queue for next level calculation
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            ll.add(sum / n); // average value in the level
        }
        return ll;
    }
}