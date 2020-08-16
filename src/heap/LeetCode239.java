package heap;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: heap
 * Date: 2020/8/15 22:04
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        Deque<Integer> deque = new LinkedList<>();
        int res[] = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i >= k && deque.peek() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if (i >= k-1) {
                res[i - k + 1] = nums[deque.peek()];
            }
        }
        return res;
    }
    public int[] maxSlidingWindow2(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                priorityQueue.offer(nums[i]);
                continue;
            }
            priorityQueue.remove(nums[i - k + 1]);
            priorityQueue.add(nums[i]);
            res[i - k + 1] = priorityQueue.peek();
        }
        return res;
    }
}
