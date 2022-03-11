package com.company.Arrays_3;

import java.util.List;

public class Rotate_List {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {

    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        while (k >= len) {
            k = k / len;
        }
        if (k == 0)  return head;
        temp = head;
        for (int i = 0; i < (len - k) - 1; i++) {
            temp = temp.next;
        }
        ListNode ans = temp.next;
        temp.next = null;
        ListNode a = ans;
        while (a.next != null) {
            a = a.next;
        }
        a.next = head;
        return ans;
    }
}
