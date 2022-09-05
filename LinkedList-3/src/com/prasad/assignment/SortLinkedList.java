package com.prasad.assignment;

public class SortLinkedList {

    public ListNode sortList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode mid = getMid(A);
        ListNode head = A;
        ListNode head2 = mid.next;
        mid.next = null;

        head = sortList(head);
        head2 = sortList(head2);
        return merge2SortedLinkedLists(head, head2);
    }

    private ListNode merge2SortedLinkedLists(ListNode A, ListNode B) {
        ListNode head = A;
        ListNode head2 = B;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (head != null || head2 != null) {
            if (head2 == null || (head != null && head.val <= head2.val)) {
                dummy.next = head;
                head = head.next;
            } else {
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;
        }
        return temp.next;
    }

    private ListNode getMid(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
