/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curr = head;
        
        ListNode n1 = l1, n2 = l2;
        int r = 0;
        while (n1 != null || n2 != null)
        {
            int sum = r;
            if (n1 != null)
            {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null)
            {
                sum += n2.val;
                n2 = n2.next;
            }
            
            r = sum / 10;
            sum = sum % 10;
            
            if (curr != null)
            {
                curr.next = new ListNode(sum);
                curr = curr.next;
            }
            else
            {
                curr = new ListNode(sum);
                head = curr;
            }
        }
        
        if (r > 0)
        {
            curr.next = new ListNode(r);
        }
        
        return head;
    }
}