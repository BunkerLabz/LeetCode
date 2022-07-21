/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// -- Brute Force --
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         if(head.next == null)
//             return head;
//         ListNode curNode = head;
//         int count = 0;
//         while(curNode != null) {
//             curNode = curNode.next;
//             count++;
//         }
//         int mid = 0;
//         if(count % 2 == 0) {
//             mid = count / 2 + 1;
//             curNode = head;
//             while(mid > 1) {
//                 curNode = curNode.next;
//                 mid--;
//             }
//             return curNode;
//         }
//         else
//             mid = count / 2;
//         curNode = head;
//         while(mid > 0) {
//             curNode = curNode.next;
//             mid--;
//         }
//         System.out.println(curNode.val);
//         return curNode;
//     }
// }
// -- Brute Force --

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
