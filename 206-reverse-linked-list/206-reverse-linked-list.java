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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode prevNode = head;
        ListNode curNode = head.next;
        while(curNode != null) {
            ListNode nextNode = curNode.next;
            curNode.next = prevNode;
            
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        
        return head;
    }
}