package questions.linkedlist;

import core.java.listnode.ListNode;

public class HasACycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode pointer1 = head;
        ListNode pointer2 = head;

        while (pointer2 != null && pointer2.next != null) {
            pointer1 = pointer1.next; // Move slow pointer by 1 step
            pointer2 = pointer2.next.next; // Move fast pointer by 2 steps

            if (pointer1 == pointer2) { // Cycle detected
                return true;
            }
        }
        return false; // No cycle detected
    }
}
