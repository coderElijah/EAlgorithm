package tree;

import java.util.LinkedList;
import java.util.Queue;

import tree.LeetCode98.TreeNode;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: tree
 * Date: 2020/8/16 17:00
 */
public class LeetCode111 {
    public int minDepth(TreeNode root) {
//        return DFS(root);
        return BFS(root);
    }

    int DFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = DFS(root.left);
        int right = DFS(root.right);
        //这里比较巧的一点是如果left==0或者right==0 就可以直接left+right+1，返回两棵子树中不为空的那个一子树的深度，
        // 因为其实只有左右子树都为空才算是叶子节点，所以任意一个子树为空，则返回另一个子树+1就可以了
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }

    int BFS(TreeNode root){
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        int level = 0;
        while (!treeNodeQueue.isEmpty()) {
            level++;
            int n = treeNodeQueue.size();
            for (int i = 0; i < n;i++) {
                TreeNode node1 = treeNodeQueue.poll();
                if (node1.left == null && node1.right == null) {
                    return level;
                }
                if (node1.left != null) {
                    treeNodeQueue.add(node1.left);
                }
                if (node1.right != null) {
                    treeNodeQueue.add(node1.right);
                }
            }
        }
        return level;
    }

}
