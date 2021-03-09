package practice;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (ListNode node : lists) {
            while (node != null) {
                queue.offer(node.val);
                node = node.next;
            }
        }

        ListNode head = new ListNode(0);
        ListNode prev = head;

        while (!queue.isEmpty()) {
            head.next = new ListNode(queue.poll());
            head = head.next;
        }
        return prev.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
        }
    }
}
