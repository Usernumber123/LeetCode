package com.company;

// time complexity O(n*K) n*K - число массивов на их длину
// space complexity O(n) n- длина созданного массива для ответа
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode answer = new ListNode();
        ListNode cur = answer;
        Integer minIndex = null;
        boolean flag = true;
        while (flag) {
            flag = false;
            Integer minValue = null;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (minValue == null || (minValue > lists[i].val)) {
                        minIndex = i;
                        minValue = lists[i].val;
                        flag = true;
                    }
                }
            }
            if (flag) {
                cur.next = new ListNode();
                cur = cur.next;
                lists[minIndex] = lists[minIndex].next;
                cur.val = minValue;

            }

        }

        return answer.next;
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
