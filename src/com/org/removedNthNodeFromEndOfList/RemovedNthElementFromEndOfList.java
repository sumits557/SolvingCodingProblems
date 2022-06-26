package org.removedNthNodeFromEndOfList;

import java.util.*;
public class RemovedNthElementFromEndOfList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode currentNode = head;
        for(int i = 0; i < n; i++) {
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            return head.next;
        }

        ListNode nodeBeforeRemoved = head;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
            nodeBeforeRemoved = nodeBeforeRemoved.next;
        }

        nodeBeforeRemoved.next = nodeBeforeRemoved.next.next;

        return head;

    }
}
