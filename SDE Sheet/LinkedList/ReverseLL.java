package com.company.LinkedList;

import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLL {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode curr, ListNode prev) {
        if (curr == null) return prev;
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        return reverse(curr, prev);
    }

}
