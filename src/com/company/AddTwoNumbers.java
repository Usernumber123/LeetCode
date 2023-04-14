package com.company;

//  time complexity O(n), где n= max(l1.size , l2.size)
// space complexity O(n), где n= max(l1.size , l2.size) (новый список)
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode currentElement = head;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                currentElement.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentElement.val += l2.val;
                l2 = l2.next;
            }
            if ((currentElement.val / 10) > 0) {
                currentElement.val = currentElement.val % 10;
                currentElement.next = new ListNode(1);
                currentElement = currentElement.next;
            } else {
                if (l1 != null || l2 != null) {
                    currentElement.next = new ListNode(0);
                    currentElement = currentElement.next;
                }
            }
        }
        return head;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
