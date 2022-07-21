package org.checkPalindromeFromLinkedList;

import java.util.*;
import java.io.*;

public class CheckPalindromeFromLinkedList {


    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();

        //convert link list into Arraylist
        ListNode currentNode = head;
        while(currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        //reverse vals ArrayList
        List<Integer> reverseVals = new ArrayList<>();
        for(int i = vals.size() - 1; i >= 0; i--) {
            reverseVals.add(vals.get(i));
        }

        // check if the two arraylist are equal to each other
        for(int i=0; i < vals.size() - 1; i++) {
            if (vals.get(i) != reverseVals.get(i)) {
                return false;
            }
        }
        return true;
    }
}
