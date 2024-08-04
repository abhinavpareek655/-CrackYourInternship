/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class IsSubtree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        return isIdentical(root,subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isIdentical(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        else if(s==null || t==null) return false;
        return s.val == t.val && isIdentical(s.left,t.left) && isIdentical(s.right, t.right);
    }
}