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
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        return isSame(root.right,root.left);
    }
    public boolean isSame(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        return s.val==t.val && isSame(s.left,t.right) && isSame(s.right,t.left);
    }
}