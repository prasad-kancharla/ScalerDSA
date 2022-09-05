package com.prasad.homework;

public class PartitionList {

    public ListNode partition(ListNode A, int B) {
        ListNode temp = A;

        ListNode dummy1 = new ListNode(-1);
        ListNode temp1 = dummy1;
        ListNode dummy2 = new ListNode(-1);
        ListNode temp2 = dummy2;

        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = null;
            if (temp.val < B) {
                dummy1.next = temp;
                dummy1 = dummy1.next;
            } else {
                dummy2.next = temp;
                dummy2 = dummy2.next;
            }
            temp = nextNode;
        }
        dummy1.next = temp2.next;
        ListNode head = temp1.next;
        temp1.next = null;
        return head;
    }
}
