package stack;

import java.util.Stack;

/**
 * Description:
 *  leetcode232
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: stack
 * Date: 2020/8/14 16:55
 */
public class LeetCode232 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public LeetCode232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }
        } else {
            return stack2.pop();
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.peek();
            }
        } else {
            return stack2.peek();

        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            return true;
        }
        return false;
    }

}
