package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: tree
 * Date: 2020/8/16 19:04
 */
public class LeetCode22 {
    List<String> res = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        dfs(0, 0, "", n);
        return res;
    }

    void dfs(int left, int right, String result,int n) {
        if (left == n && right == n) {
            res.add(result);
            return;
        }
        if (left < n) {
            dfs(left + 1, right, result + "(",n);
        }
        if (left > right && right < n) {
            dfs(left, right + 1, result + ")",n);
        }
    }

}
