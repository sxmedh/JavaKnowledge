package questions.linkedlist;

import core.java.listnode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListQuestions {
    @Test
    void testHasCycle() {
        HasACycle solution = new HasACycle();

        // Case 1: Linked list with a cycle (1 -> 2 -> 3 -> 4 -> back to 2)
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating a cycle

        assertTrue(solution.hasCycle(node1), "Expected true for a cyclic linked list");
    }
}
