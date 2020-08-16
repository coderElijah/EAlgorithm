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
 * Date: 2020/8/16 15:50
 */
public class LeetCode98 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<TreeNode> inOrder = new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        for (int i = 1; i < inOrder.size(); i++) {
            if (inOrder.get(i).val <= inOrder.get(i - 1).val) {
                return false;
            }
        }
        return true;
    }
    // 方法1 利用二叉平衡术中序遍历之后是递增数组的特性，来判断是不是合法二叉树
    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        inOrder.add(root);
        inOrder(root.right);
    }
    // 方法二 同方法一类似 但是不需要存储整个数组，只需要记录前一个遍历的数，并且判断是不是小于后一个数即可

    TreeNode preNode = null;

    boolean inOrder2(TreeNode root){
        if (root == null) {
            return true;
        }
        //如果遍历左子树 不为平衡 则直接返回false
        if (!inOrder2(root.left)) {
            return false;
        }
        if (preNode != null && root.val <= preNode.val) {
            return false;
        }
        preNode = root;
        return inOrder2(root.right);

    }
}
