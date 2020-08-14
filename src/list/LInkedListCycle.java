package list;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * leetcode 141
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: list
 * Date: 2020/8/14 16:17
 */
public class LInkedListCycle {
    /**
     * set实现
     * @param head
     * @return
     */
    public boolean hasCycleBySet(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode pos = head;
        while (pos != null) {
            if (set.contains(pos)) {
                return false;
            }
            set.add(pos);
        }
        return true;
    }

    /**
     * 快慢指针实现
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}
