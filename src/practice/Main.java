package practice;

// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

// Example 1:
// Input: head = [1,2,2,1]
// Output: true
// Example 2:
// Input: head = [1,2]
// Output: false

// Constraints:
// The number of nodes in the list is in the range [1, 105].
// 0 <= Node.val <= 9

// Follow up: Could you do it in O(n) time and O(1) space?

public class Main {

    public static void main(String[] args) {
        ListNode ln = ListNode.arrayToListNode(new int[]{1, 2, 3});
        //ListNode ln = ListNode.arrayToListNode(new int[]{});
        //ln.printListNode();
        System.out.println(new Solution().isPalindrome(ln));
    }
}
