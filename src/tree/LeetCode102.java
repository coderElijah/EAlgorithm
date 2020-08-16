package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: tree
 * Date: 2020/8/16 16:48
 */
import tree.LeetCode98.TreeNode;
public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> res = new LinkedList<>();
        while (!queue.isEmpty()) {
            int num = queue.size();
            List<Integer> levelList = new ArrayList<>(num);
            for (int i = 0; i < num; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                levelList.add(node.val);
            }
            res.add(levelList);
        }
        return res;

    }
}
