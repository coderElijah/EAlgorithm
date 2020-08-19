package list;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: list
 * Date: 2020/8/19 16:32
 */
public class LeetCode876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head, pre = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }

        return slow;

    }
}
