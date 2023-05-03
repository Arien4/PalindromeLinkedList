package practice;

import java.util.List;

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

    public static ListNode arrayToListNode(int[] array) {
        if (array.length != 0) {
            ListNode prev = new ListNode(array[array.length - 1]);
            ListNode curr = null;
            for (int i = array.length - 2; i > 0; i--) {
                curr = new ListNode(array[i]);
                curr.next = prev;
                prev = curr;
            }
            curr = new ListNode(array[0]);
            curr.next = prev;
            return curr;
        }
        return new ListNode();
    }

    public void printListNode() {
        ListNode ln = this;
        while (ln.next != null) {
            System.out.println(ln.val);
            ln = ln.next;
        }
        System.out.println(ln.val);
    }

}
