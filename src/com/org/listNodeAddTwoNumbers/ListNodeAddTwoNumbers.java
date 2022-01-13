public class ListNodeAddTwoNumbers {

    /**
     * Just like how you would sum two numbers on a piece of paper, we begin by summing the least-significant digits, which is the head of
     * l
     * 1
     * l1 and
     * l
     * 2
     * l2. Since each digit is in the range of
     * 0
     * …
     * 9
     * 0…9, summing two digits may "overflow". For example
     * 5
     * +
     * 7
     * =
     * 12
     * 5+7=12. In this case, we set the current digit to
     * 2
     * 2 and bring over the
     * c
     * a
     * r
     * r
     * y
     * =
     * 1
     * carry=1 to the next iteration.
     * c
     * a
     * r
     * r
     * y
     * carry must be either
     * 0
     * 0 or
     * 1
     * 1 because the largest possible sum of two digits (including the carry) is
     * 9
     * +
     * 9
     * +
     * 1
     * =
     * 19
     * 9+9+1=19.
     *
     * The pseudocode is as following:
     *
     * Initialize current node to dummy head of the returning list.
     * Initialize carry to
     * 0
     * 0.
     * Initialize
     * p
     * p and
     * q
     * q to head of
     * l
     * 1
     * l1 and
     * l
     * 2
     * l2 respectively.
     * Loop through lists
     * l
     * 1
     * l1 and
     * l
     * 2
     * l2 until you reach both ends.
     * Set
     * x
     * x to node
     * p
     * p's value. If
     * p
     * p has reached the end of
     * l
     * 1
     * l1, set to
     * 0
     * 0.
     * Set
     * y
     * y to node
     * q
     * q's value. If
     * q
     * q has reached the end of
     * l
     * 2
     * l2, set to
     * 0
     * 0.
     * Set
     * s
     * u
     * m
     * =
     * x
     * +
     * y
     * +
     * c
     * a
     * r
     * r
     * y
     * sum=x+y+carry.
     * Update
     * c
     * a
     * r
     * r
     * y
     * =
     * s
     * u
     * m
     * /
     * 10
     * carry=sum/10.
     * Create a new node with the digit value of
     * (
     * s
     * u
     * m
     *
     * m
     * o
     * d
     *
     * 10
     * )
     * (summod10) and set it to current node's next, then advance current node to next.
     * Advance both
     * p
     * p and
     * q
     * q.
     * Check if
     * c
     * a
     * r
     * r
     * y
     * =
     * 1
     * carry=1, if so append a new node with digit
     * 1
     * 1 to the returning list.
     * Return dummy head's next node.
     * Note that we use a dummy head to simplify the code. Without a dummy head, you would have to write extra conditional statements to initialize the head's value.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while(p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
