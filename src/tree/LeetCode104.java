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
 * Date: 2020/8/16 16:59
 */
public class LeetCode104 {
    public int maxDepth(TreeNode root) {
//        return BFS(root);
        return DFS(root);
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

    int DFS(TreeNode root){
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(DFS(root.left), DFS(root.right));
    }
}
