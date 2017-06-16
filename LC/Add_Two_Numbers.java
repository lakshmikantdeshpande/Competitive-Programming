public class Add_Two_Numbers {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, curr = head;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return head.next;
    }

    private static void display(ListNode temp) {
        if (temp != null) {
            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) throws Exception {
        ListNode a = new ListNode(0);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);

        ListNode b = new ListNode(1);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);
        Add_Two_Numbers atn = new Add_Two_Numbers();
        display(atn.addTwoNumbers(a, b));
    }
}
