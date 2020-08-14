package stack;

import java.util.Stack;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: stack
 * Date: 2020/8/14 16:31
 */
public class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            }else{
                if(s.charAt(i)==')'&& stack.peek()=='('){
                    stack.pop();
                } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
}
