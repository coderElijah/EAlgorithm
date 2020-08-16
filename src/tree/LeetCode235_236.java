package tree;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: tree
 * Date: 2020/8/16 16:27
 */
public class LeetCode235_236 {
    public LeetCode98.TreeNode lowestCommonAncestor(LeetCode98.TreeNode root, LeetCode98.TreeNode p, LeetCode98.TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        LeetCode98.TreeNode left = lowestCommonAncestor(root.left, p, q);

        LeetCode98.TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        }else{
            return root;
        }
    }
}
