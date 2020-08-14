package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: queue
 * Date: 2020/8/14 16:59
 */
public class LeetCode225 {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    int top;

    /**
     * Initialize your data structure here.
     */
    public LeetCode225() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue1.offer(x);
        top = x;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (queue1.isEmpty()) {
            return -1;
        }
        while (queue1.size() > 1) {
            top = queue1.poll();
            queue2.offer(top);
        }
        int res = queue1.poll();
        Queue<Integer> tmp = queue1;
        queue1 = queue2;
        queue2 = tmp;
        return res;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return top;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

}
